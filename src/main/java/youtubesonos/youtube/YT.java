package youtubesonos.youtube;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.YouTubeScopes;
import com.google.api.services.youtube.model.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class YT {

    /** Application name. */
    private static final String APPLICATION_NAME = "YouTubeSonos";

    /** Directory to store user credentials for this application. */
    private static final java.io.File DATA_STORE_DIR = new java.io.File(".", ".credentials/YouTubeSonos");

    /** Global instance of the {@link FileDataStoreFactory}. */
    private static FileDataStoreFactory DATA_STORE_FACTORY;

    /** Global instance of the JSON factory. */
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    /** Global instance of the HTTP transport. */
    private static HttpTransport HTTP_TRANSPORT;

    private static final List<String> SCOPES = Arrays.asList(YouTubeScopes.YOUTUBE_READONLY);

    private static ConcurrentHashMap<String, PageTokenCache> pageTokenCaches = new ConcurrentHashMap<>();

    private static int MAX_RESULTS = 50;

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        }
        catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

    private static GoogleAuthorizationCodeFlow getGoogleAuthorizationCodeFlow() throws IOException {
        InputStream in = YT.class.getResourceAsStream("/client_secret.json");
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        return new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(DATA_STORE_FACTORY)
                .setAccessType("offline")
                .build();
    }

    public static boolean isUserAuthorized(String userId) throws IOException {
        GoogleAuthorizationCodeFlow flow = getGoogleAuthorizationCodeFlow();
        Credential credential = flow.loadCredential(userId);
        return credential != null;
    }

    public static boolean isUserExpired(String userId) throws IOException {
        GoogleAuthorizationCodeFlow flow = getGoogleAuthorizationCodeFlow();
        Credential credential = flow.loadCredential(userId);
        return credential == null || (credential.getExpiresInSeconds() > 0 && credential.getRefreshToken() == null);
    }

    public static String getNewAuthorizationUrl(String redirectUri, String state) throws IOException {
        GoogleAuthorizationCodeFlow flow = getGoogleAuthorizationCodeFlow();
        return flow.newAuthorizationUrl().setApprovalPrompt("force").setRedirectUri(redirectUri).setState(state).build();
    }

    public static void authorizeNewUser(String userId, String code) throws IOException {
        GoogleAuthorizationCodeFlow flow = getGoogleAuthorizationCodeFlow();
        TokenResponse response = flow.newTokenRequest(code).setRedirectUri(YouTubeAuthHttpHandler.getInstance().getRedirectUri()).execute();
        flow.createAndStoreCredential(response, userId);
    }

    public static YouTube getYouTubeService(String userId) throws IOException {
        GoogleAuthorizationCodeFlow flow = getGoogleAuthorizationCodeFlow();
        return new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, flow.loadCredential(userId)).setApplicationName(APPLICATION_NAME).build();
    }

    public static String getBestThumbnailUrl(ThumbnailDetails thumbnailDetails) {
        if (thumbnailDetails == null) return "";

        if (thumbnailDetails.getMaxres() != null)
            return thumbnailDetails.getMaxres().getUrl();
        if (thumbnailDetails.getStandard() != null)
            return thumbnailDetails.getStandard().getUrl();
        if (thumbnailDetails.getHigh() != null)
            return thumbnailDetails.getHigh().getUrl();
        if (thumbnailDetails.getMedium() != null)
            return thumbnailDetails.getMedium().getUrl();
        if (thumbnailDetails.getDefault() != null)
            return thumbnailDetails.getDefault().getUrl();

        return "";
    }

    public static String getWorstThumbnailUrl(ThumbnailDetails thumbnailDetails) {
        if (thumbnailDetails == null) return "";

        if (thumbnailDetails.getDefault() != null)
            return thumbnailDetails.getDefault().getUrl();
        if (thumbnailDetails.getMedium() != null)
            return thumbnailDetails.getMedium().getUrl();
        if (thumbnailDetails.getHigh() != null)
            return thumbnailDetails.getHigh().getUrl();
        if (thumbnailDetails.getStandard() != null)
            return thumbnailDetails.getStandard().getUrl();
        if (thumbnailDetails.getMaxres() != null)
            return thumbnailDetails.getMaxres().getUrl();

        return "";
    }

    private static PageTokenCache getPageTokenCache(String key, String userId) {
        String pageTokenCacheKey = key + userId;
        if (!pageTokenCaches.containsKey(pageTokenCacheKey))
            pageTokenCaches.put(pageTokenCacheKey, new PageTokenCache());

        return pageTokenCaches.get(pageTokenCacheKey);
    }

    private static PageTokenCacheItem getPageTokenCacheItem(String pageTokenCacheKey, String userId, int pageIndex) throws PageTokenNotFoundException {
        if (pageIndex == 0) {
            return new PageTokenCacheItem(0, "");
        }

        PageTokenCache pageTokenCache = getPageTokenCache(pageTokenCacheKey, userId);
        PageTokenCacheItem pageTokenCacheItem = pageTokenCache.getItem(pageIndex);

        if (pageTokenCacheItem == null || pageIndex - pageTokenCacheItem.getPageIndex()  >= MAX_RESULTS)
            throw new PageTokenNotFoundException("PageToken for pageIndex " + pageIndex + " could not be found");

        return pageTokenCacheItem;
    }

    private static void setPageToken(String pageTokenCacheKey, String userId, int pageIndex, String pageToken) {
        if (pageToken != null && !pageToken.isEmpty()) {
            PageTokenCache pageTokenCache = getPageTokenCache(pageTokenCacheKey, userId);
            pageTokenCache.setPageToken(pageIndex, pageToken);
        }
    }

    private static void cropItemsAccordingly(List items, int requestedIndex, int actualIndex) {
        if (actualIndex != requestedIndex) {
            items.subList(0, requestedIndex - actualIndex).clear();
        }
    }

    public static SubscriptionListResponse getSubscriptions(String userId, int pageIndex) throws PageTokenNotFoundException, IOException {
        String pageTokenCacheKey = "subscriptions";
        PageTokenCacheItem pageTokenCacheItem = getPageTokenCacheItem(pageTokenCacheKey, userId, pageIndex);
        String pageToken = pageTokenCacheItem.getPageToken();
        YouTube youtube = getYouTubeService(userId);
        YouTube.Subscriptions.List list = youtube.subscriptions().list("snippet").setMine(true).setMaxResults((long)MAX_RESULTS).setPageToken(pageToken);
        SubscriptionListResponse response = list.execute();
        setPageToken(pageTokenCacheKey, userId, pageTokenCacheItem.getPageIndex() + MAX_RESULTS, response.getNextPageToken());
        cropItemsAccordingly(response.getItems(), pageIndex, pageTokenCacheItem.getPageIndex());

        return response;
    }

    public static PlaylistListResponse getUserPlaylists(String userId, int pageIndex) throws PageTokenNotFoundException, IOException {
        String pageTokenCacheKey = "playlists";
        PageTokenCacheItem pageTokenCacheItem = getPageTokenCacheItem(pageTokenCacheKey, userId, pageIndex);
        String pageToken = pageTokenCacheItem.getPageToken();
        YouTube youtube = getYouTubeService(userId);
        YouTube.Playlists.List list = youtube.playlists().list("snippet,localizations").setMine(true).setMaxResults((long)MAX_RESULTS).setPageToken(pageToken);
        PlaylistListResponse response = list.execute();
        setPageToken(pageTokenCacheKey, userId, pageTokenCacheItem.getPageIndex() + MAX_RESULTS, response.getNextPageToken());
        cropItemsAccordingly(response.getItems(), pageIndex, pageTokenCacheItem.getPageIndex());

        return response;
    }

    public static PlaylistItemListResponse getPlaylistVideos(String playlistId, String userId, int pageIndex) throws PageTokenNotFoundException, IOException {
        String pageTokenCacheKey = "playlistVideos" + playlistId;
        PageTokenCacheItem pageTokenCacheItem = getPageTokenCacheItem(pageTokenCacheKey, userId, pageIndex);
        String pageToken = pageTokenCacheItem.getPageToken();
        YouTube youtube = getYouTubeService(userId);
        YouTube.PlaylistItems.List list = youtube.playlistItems().list("snippet").setPlaylistId(playlistId).setMaxResults((long)MAX_RESULTS).setPageToken(pageToken);
        PlaylistItemListResponse response = list.execute();
        setPageToken(pageTokenCacheKey, userId, pageTokenCacheItem.getPageIndex() + MAX_RESULTS, response.getNextPageToken());
        cropItemsAccordingly(response.getItems(), pageIndex, pageTokenCacheItem.getPageIndex());

        return response;
    }

    public static String getUploadsPlaylist(String channelId, String userId) throws IOException {
        YouTube youtube = getYouTubeService(userId);
        ChannelListResponse response = youtube.channels().list("contentDetails").setId(channelId).execute();
        if (response.getItems().size() == 1) {
            return response.getItems().get(0).getContentDetails().getRelatedPlaylists().getUploads();
        }
        return null;
    }

    public static PlaylistListResponse getChannelPlaylists(String channelId, String userId, int pageIndex) throws PageTokenNotFoundException, IOException {
        String pageTokenCacheKey = "channelPlaylists" + channelId;
        PageTokenCacheItem pageTokenCacheItem = getPageTokenCacheItem(pageTokenCacheKey, userId, pageIndex);
        String pageToken = pageTokenCacheItem.getPageToken();
        YouTube youtube = getYouTubeService(userId);
        PlaylistListResponse response = youtube.playlists().list("snippet,localizations").setChannelId(channelId).setMaxResults((long)MAX_RESULTS).setPageToken(pageToken).execute();
        setPageToken(pageTokenCacheKey, userId, pageTokenCacheItem.getPageIndex() + MAX_RESULTS, response.getNextPageToken());
        cropItemsAccordingly(response.getItems(), pageIndex, pageTokenCacheItem.getPageIndex());

        return response;
    }

    public static VideoListResponse getPopularVideos(String categoryId, String userId, int pageIndex) throws PageTokenNotFoundException, IOException {
        String pageTokenCacheKey = "popularVideos" + categoryId;
        PageTokenCacheItem pageTokenCacheItem = getPageTokenCacheItem(pageTokenCacheKey, userId, pageIndex);
        String pageToken = pageTokenCacheItem.getPageToken();
        YouTube youtube = getYouTubeService(userId);
        YouTube.Videos.List list = youtube.videos().list("snippet").setChart("mostPopular").setVideoCategoryId(categoryId).setMaxResults((long)MAX_RESULTS).setPageToken(pageToken);
        VideoListResponse response = list.execute();
        setPageToken(pageTokenCacheKey, userId, pageTokenCacheItem.getPageIndex() + MAX_RESULTS, response.getNextPageToken());
        cropItemsAccordingly(response.getItems(), pageIndex, pageTokenCacheItem.getPageIndex());

        return response;
    }

    public static SearchListResponse search(String term, String type, String userId, int pageIndex) throws PageTokenNotFoundException, IOException {
        String pageTokenCacheKey = "search" + type + term;
        PageTokenCacheItem pageTokenCacheItem = getPageTokenCacheItem(pageTokenCacheKey, userId, pageIndex);
        String pageToken = pageTokenCacheItem.getPageToken();
        YouTube youtube = getYouTubeService(userId);
        YouTube.Search.List list = youtube.search().list("snippet").setQ(term).setType(type).setMaxResults((long)MAX_RESULTS).setPageToken(pageToken);
        SearchListResponse response = list.execute();
        setPageToken(pageTokenCacheKey, userId, pageTokenCacheItem.getPageIndex() + MAX_RESULTS, response.getNextPageToken());
        cropItemsAccordingly(response.getItems(), pageIndex, pageTokenCacheItem.getPageIndex());

        return response;
    }
}
