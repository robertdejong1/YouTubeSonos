package youtubesonos;

import smapi.*;
import youtubesonos.builders.AppLinkInfoBuilder;
import youtubesonos.builders.AppLinkResultBuilder;
import youtubesonos.builders.DeviceLinkCodeResultBuilder;
import youtubesonos.requesthandlers.ChannelMetadataRequestHandler;
import youtubesonos.requesthandlers.MultiplePlaylistsMetadataRequestHandler;
import youtubesonos.youtube.YT;
import youtubesonos.youtube.YouTubeAuthHttpHandler;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@WebService(endpointInterface = "smapi.SonosSoap")
public class SonosApi implements SonosSoap {

    @Resource
    private WebServiceContext webServiceContext;
    private SonosMetadata sonosMetadata;

    public SonosApi() {
        sonosMetadata = new SonosMetadata(this);
    }

    @Override
    public String getSessionId(String username, String password, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public MediaList getMetadata(String id, int index, int count, Boolean recursive, Credentials credentials, Context context) throws CustomFault {
        verifyCredentials(credentials);
        String userId = SonosAuth.getUserId(credentials);

        if (id.equals("root")) {
            return sonosMetadata.getRoot();
        }

        else if (id.equals("search")) {
            return sonosMetadata.getSearch();
        }

        else if (id.equals("popularMusic")) {
            return sonosMetadata.getPopularMusicVideos(index, count, userId);
        }

        else if (id.equals("playlists")) {
            return sonosMetadata.getPlaylists(index, count, userId);
        }

        else if (id.equals("subscriptions")) {
            return sonosMetadata.getSubscriptions(index, count, userId);
        }

        else if (id.startsWith(IdPrefix.CHANNEL.toString())) {
            return new ChannelMetadataRequestHandler(userId, this, id.substring(IdPrefix.CHANNEL.toString().length()), index, count).handle();
        }

        else if (id.startsWith(IdPrefix.PLAYLIST.toString())) {
            return sonosMetadata.getPlaylistVideos(id.substring(IdPrefix.PLAYLIST.toString().length()), index, count, userId);
        }

        else if (id.startsWith(IdPrefix.CHANNELPLAYLISTS.toString())) {
            return sonosMetadata.getChannelPlaylists(id.substring(IdPrefix.CHANNELPLAYLISTS.toString().length()), index, count, userId);
        }

        else if (id.startsWith(IdPrefix.MULTIPLE_PLAYLISTS.toString())) {
            return new MultiplePlaylistsMetadataRequestHandler(userId, this, id.substring(IdPrefix.MULTIPLE_PLAYLISTS.toString().length()), index, count).handle();
        }

        throw SonosFaults.ITEM_NOT_FOUND;
    }

    @Override
    public ExtendedMetadata getExtendedMetadata(String id, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public String getExtendedMetadataText(String id, String type, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public UserInfo getUserInfo(Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public ItemRating rateItem(String id, int rating, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public MediaList search(String id, String term, int index, int count, Credentials credentials, Context context) throws CustomFault {
        verifyCredentials(credentials);

        if (id.equals("channels")) {
            return sonosMetadata.searchChannels(term, index, count, SonosAuth.getUserId(credentials));
        }
        else if (id.equals("playlists")) {
            return sonosMetadata.searchPlaylists(term, index, count, SonosAuth.getUserId(credentials));
        }
        else if (id.equals("videos")) {
            return sonosMetadata.searchVideos(term, index, count, SonosAuth.getUserId(credentials));
        }
        return null;
    }

    @Override
    public MediaMetadata getMediaMetadata(String id, Credentials credentials, Context context) throws CustomFault {
        verifyCredentials(credentials);

        if (id.startsWith(IdPrefix.VIDEO.toString())) {
            return sonosMetadata.getMediaMetadata(id.substring(IdPrefix.VIDEO.toString().length()), SonosAuth.getUserId(credentials));
        }

        throw SonosFaults.ITEM_NOT_FOUND;
    }

    @Override
    public void getMediaURI(String id, MediaUriAction action, Integer secondsSinceExplicit, Holder<String> deviceSessionToken, Holder<String> getMediaURIResult, Holder<EncryptionContext> deviceSessionKey, Holder<EncryptionContext> contentKey, Holder<HttpHeaders> httpHeaders, Holder<Integer> uriTimeout, Holder<PositionInformation> positionInformation, Holder<String> privateDataFieldName, Credentials credentials, Context context) throws CustomFault {
        verifyCredentials(credentials);

        if (id.startsWith(IdPrefix.VIDEO.toString())) {
            String videoId = id.substring(IdPrefix.VIDEO.toString().length());
            getMediaURIResult.value = String.format("%s/stream?id=%s", S.getResources().getString(S.WEB_SERVER_URL), videoId);
        }
        else {
            throw SonosFaults.ITEM_NOT_FOUND;
        } 
    }

    @Override
    public String getScrollIndices(String id, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public String createItem(String favorite, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public void deleteItem(String favorite, Credentials credentials, Context context) throws CustomFault {

    }

    @Override
    public LastUpdate getLastUpdate(Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public void reportStatus(String id, int errorCode, String message, Credentials credentials, Context context) throws CustomFault {

    }

    @Override
    public void setPlayedSeconds(String id, int seconds, String contextId, String privateData, Integer offsetMillis, Credentials credentials, Context context) throws CustomFault {

    }

    @Override
    public ReportPlaySecondsResult reportPlaySeconds(String id, int seconds, String contextId, String privateData, Integer offsetMillis, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public void reportPlayStatus(String id, String status, String contextId, Integer offsetMillis, Credentials credentials, Context context) throws CustomFault {

    }

    @Override
    public void reportAccountAction(String type, Credentials credentials, Context context) throws CustomFault {

    }

    @Override
    public AppLinkResult getAppLink(String householdId, String hardware, String osVersion, String sonosAppName, String callbackPath, Credentials credentials, Context context) throws CustomFault {
        try {
            String linkCode = SonosAuth.generateLinkCode();
            String userId = SonosAuth.generateUserId();
            YouTubeAuthHttpHandler.getInstance().addPendingLinkCodeUserId(linkCode, userId);

            return new AppLinkResultBuilder()
                    .setAuthorizeAccount(new AppLinkInfoBuilder()
                            .setDeviceLink(new DeviceLinkCodeResultBuilder()
                                    .setLinkCode(linkCode)
                                    .setRegUrl(YT.getNewAuthorizationUrl(YouTubeAuthHttpHandler.getInstance().getRedirectUri(), linkCode)))
                            .setAppUrlStringId("SIGN_IN"))
                    .setCreateAccount(new AppLinkInfoBuilder()
                            .setAppUrlStringId("SIGN_UP")
                            .setAppUrl("https://www.youtube.com/account"))
                    .build();
        }
        catch (Exception e) {
            throw new CustomFault("Could not retrieve registration URL", new CustomFaultDetail(), e);
        }
    }

    @Override
    public DeviceLinkCodeResult getDeviceLinkCode(String householdId, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public DeviceAuthTokenResult getDeviceAuthToken(String householdId, String linkCode, String linkDeviceId, String callbackPath, Credentials credentials, Context context) throws CustomFault {
        if (YouTubeAuthHttpHandler.getInstance().successLinkCodeExists(linkCode)) {
            DeviceAuthTokenResult tokenResult = new DeviceAuthTokenResult();
            String userId = YouTubeAuthHttpHandler.getInstance().getUserIdForSuccessLinkCode(linkCode);
            tokenResult.setAuthToken(userId);
            return tokenResult;
        }
        else if (YouTubeAuthHttpHandler.getInstance().pendingLinkCodeExists(linkCode)) {
            throw SonosFaults.NOT_LINKED_RETRY;
        }
        else {
            throw SonosFaults.NOT_LINKED_FAILURE;
        }
    }

    @Override
    public DeviceAuthTokenResult refreshAuthToken(Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public SegmentMetadataList getStreamingMetadata(String id, XMLGregorianCalendar startTime, int duration, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public ContentKey getContentKey(String id, String uri, String deviceSessionToken, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public CreateContainerResult createContainer(String containerType, String title, String parentId, String seedId, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public AddToContainerResult addToContainer(String id, String parentId, int index, String updateId, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public RenameContainerResult renameContainer(String id, String title, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public DeleteContainerResult deleteContainer(String id, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public RemoveFromContainerResult removeFromContainer(String id, String indices, String updateId, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    @Override
    public ReorderContainerResult reorderContainer(String id, String from, int to, String updateId, Credentials credentials, Context context) throws CustomFault {
        return null;
    }

    public List<Locale> getLocales() {
        Map headers = (Map) webServiceContext.getMessageContext().get(MessageContext.HTTP_REQUEST_HEADERS);
        if (headers.containsKey("Accept-Language")) {
            String acceptLanguage = (String)((List)headers.get("Accept-Language")).get(0);
            return Locale.LanguageRange.parse(acceptLanguage).stream().map(range -> new Locale(range.getRange())).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    private void verifyCredentials(Credentials credentials) throws CustomFault {
        try {
            SonosAuth.VerifyCredentialsResult verifyResult = SonosAuth.verifyCredentials(credentials);

            if (verifyResult.isAuthorized() && verifyResult.isExpired()) {
                throw SonosFaults.AUTH_TOKEN_EXPIRED;
            }
            else if (!verifyResult.isAuthorized()) {
                throw SonosFaults.LOGIN_INVALID;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            throw SonosFaults.LOGIN_INVALID;
        }
    }
}
