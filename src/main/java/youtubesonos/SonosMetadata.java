package youtubesonos;

import base.Resources;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.*;
import smapi.ItemType;
import smapi.MediaCollection;
import smapi.MediaList;
import smapi.MediaMetadata;
import youtubesonos.youtube.PageTokenNotFoundException;
import youtubesonos.youtube.YT;
import youtubesonos.builders.MediaCollectionBuilder;
import youtubesonos.builders.MediaListBuilder;
import youtubesonos.builders.MediaMetadataBuilder;
import youtubesonos.builders.TrackMetadataBuilder;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class SonosMetadata {

    private SonosApi sonosApi;

    public SonosMetadata(SonosApi sonosApi) {
        this.sonosApi = sonosApi;
    }

    public MediaList getRoot() {
        List<Locale> locales = sonosApi.getLocales();

        return new MediaListBuilder()
                .addMedia(new MediaCollectionBuilder()
                        .setId("popularMusic")
                        .setTitle(R.getResources().getString(R.POPULAR_MUSIC, locales))
                        .setItemType(ItemType.TRACK_LIST)
                        .setDisplayType("List"))
                .addMedia(new MediaCollectionBuilder()
                        .setId("playlists")
                        .setTitle(R.getResources().getString(R.PLAYLISTS, locales))
                        .setItemType(ItemType.CONTAINER)
                        .setDisplayType("List"))
                .addMedia(new MediaCollectionBuilder()
                        .setId("subscriptions")
                        .setTitle(R.getResources().getString(R.SUBSCRIPTIONS, locales))
                        .setItemType(ItemType.CONTAINER)
                        .setDisplayType("List"))
                .setIndex(0)
                .setTotal(3)
                .setCalculatedCount()
                .build();
    }

    public MediaList getSubscriptions(int index, int count, String userId) {
        try {
            SubscriptionListResponse response = YT.getSubscriptions(userId, index);
            List<Subscription> subscriptions = response.getItems();

            MediaListBuilder builder = new MediaListBuilder().setIndex(index).setTotal(response.getPageInfo().getTotalResults());

            for(Subscription sub : subscriptions) {
                if (count == 0) break;

                builder.addMedia(createMediaCollection(sub));
                count--;
            }

            return builder.setCalculatedCount().build();
        }
        catch (IOException e) {
            System.out.println("could not get subscriptions");
            e.printStackTrace();
        }
        catch (PageTokenNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MediaList getChannelContents(String channelId, int index, int count, String userId) {
        try {
            String uploadsPlaylistId = YT.getUploadsPlaylist(channelId, userId);
            PlaylistItemListResponse response = YT.getPlaylistVideos(uploadsPlaylistId, userId, index == 0 ? index : index - 1);

            MediaListBuilder builder = new MediaListBuilder().setIndex(index).setTotal(response.getPageInfo().getTotalResults() + 1);

            if (index == 0) {
                builder.addMedia(new MediaCollectionBuilder()
                        .setId(IdPrefix.CHANNELPLAYLISTS + channelId)
                        .setTitle(R.getResources().getString(R.PLAYLISTS, sonosApi.getLocales()))
                        .setItemType(ItemType.CONTAINER)
                );
                count--;
            }

            for (PlaylistItem item : response.getItems()) {
                if (count == 0) break;

                builder.addMedia(createMediaMetadata(item));
                count--;
            }

            return builder.setCalculatedCount().build();

        }
        catch (IOException | PageTokenNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public MediaList getChannelPlaylists(String channelId, int index, int count, String userId) {
        try {
            PlaylistListResponse response = YT.getChannelPlaylists(channelId, userId, index);

            MediaListBuilder builder = new MediaListBuilder().setIndex(index).setTotal(response.getPageInfo().getTotalResults());

            for (Playlist list : response.getItems()) {
                if (count == 0) break;

                builder.addMedia(createMediaCollection(list));
                count--;
            }

            return builder.setCalculatedCount().build();
        }
        catch (PageTokenNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public MediaMetadata getMediaMetadata(String videoId, String userId) {
        try {
            YouTube youtube = YT.getYouTubeService(userId);
            VideoListResponse response = youtube.videos().list("snippet,contentDetails").setId(videoId).execute();
            if(response.getItems().size() == 1) {
                Video video = response.getItems().get(0);

                return createMediaMetadataForPlayback(video);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public MediaList getPlaylists(int index, int count, String userId){
        try {
            PlaylistListResponse response = YT.getUserPlaylists(userId, index);
            List<Playlist> playlists = response.getItems();

            MediaListBuilder builder = new MediaListBuilder().setIndex(index).setTotal(response.getPageInfo().getTotalResults());

            for(Playlist list : playlists) {
                if (count == 0) break;

                builder.addMedia(createMediaCollection(list));
                count--;
            }

            return builder.setCalculatedCount().build();
        }
        catch (IOException | PageTokenNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public MediaList getPlaylistVideos(String id, int index, int count, String userId) {
        try {
            PlaylistItemListResponse response = YT.getPlaylistVideos(id, userId, index);
            List<PlaylistItem> playListItems = response.getItems();

            MediaListBuilder builder = new MediaListBuilder().setIndex(index).setTotal(response.getPageInfo().getTotalResults());

            for(PlaylistItem item : playListItems) {
                if (count == 0) break;

                builder.addMedia(createMediaMetadata(item));
                count--;
            }

            return builder.setCalculatedCount().build();
        }
        catch (IOException | PageTokenNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public MediaList getPopularMusicVideos(int index, int count, String userId) {
        try {
            VideoListResponse response = YT.getPopularVideos("10", userId, index);
            List<Video> videos = response.getItems();

            MediaListBuilder builder = new MediaListBuilder().setIndex(index).setTotal(response.getPageInfo().getTotalResults());

            for (Video video : videos) {
                if (count == 0) break;

                builder.addMedia(createMediaMetadata(video));
                count--;
            }

            return builder.setCalculatedCount().build();
        }
        catch (IOException | PageTokenNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    private MediaCollection createMediaCollection(Playlist playlist) {
        return new MediaCollectionBuilder()
                .setId(IdPrefix.PLAYLIST + playlist.getId())
                .setTitle(getLocalizedTitle(playlist))
                .setItemType(ItemType.PLAYLIST)
                .setAlbumArtURI(playlist.getSnippet().getThumbnails().getDefault().getUrl())
                .setCanPlay(true)
                .build();
    }

    private String getLocalizedTitle(Playlist playlist) {
        if (playlist.getLocalizations() != null) {
            Map<String, PlaylistLocalization> localizations = playlist.getLocalizations();
            List<Locale> locales = sonosApi.getLocales();

            for (Locale locale : locales) {
                if (localizations.get(locale.getLanguage()) != null)
                    return localizations.get(locale.getLanguage()).getTitle();

                if (locale.getLanguage().contains("-")) {
                    String[] parts = locale.getLanguage().split("-");
                    if (localizations.get(parts[0]) != null)
                        return localizations.get(parts[0]).getTitle();
                }
            }
        }

        return playlist.getSnippet().getTitle();
    }

    private MediaCollection createMediaCollection(Subscription subscription) {
        return new MediaCollectionBuilder()
                .setAlbumArtURI(subscription.getSnippet().getThumbnails().getDefault().getUrl())
                .setId(IdPrefix.CHANNEL + subscription.getSnippet().getResourceId().getChannelId())
                .setTitle(subscription.getSnippet().getTitle())
                .setItemType(ItemType.CONTAINER)
                .build();
    }

    private MediaMetadata createMediaMetadata(Video video) {
        return new MediaMetadataBuilder()
                .setId(IdPrefix.VIDEO + video.getId())
                .setTitle(video.getSnippet().getTitle())
                .setTrackMetadata(new TrackMetadataBuilder()
                    .setArtist(video.getSnippet().getChannelTitle())
                    .setArtistId(video.getSnippet().getChannelId())
                    .setAlbumArtURI(video.getSnippet().getThumbnails().getDefault().getUrl())
                    .setDuration(1))
                .setMimeType("audio/aac")
                .setItemType(ItemType.TRACK)
                .build();
    }

    private MediaMetadata createMediaMetadataForPlayback(Video video) {
        return new MediaMetadataBuilder()
                .setId(IdPrefix.VIDEO + video.getId())
                .setTitle(video.getSnippet().getTitle())
                .setTrackMetadata(new TrackMetadataBuilder()
                        .setArtist(video.getSnippet().getChannelTitle())
                        .setArtistId(video.getSnippet().getChannelId())
                        .setAlbumArtURI(YT.getBestThumbnailUrl(video.getSnippet().getThumbnails()))
                        .setDuration((int)Duration.parse(video.getContentDetails().getDuration()).getSeconds()))
                .setMimeType("audio/aac")
                .setItemType(ItemType.TRACK)
                .build();
}

    private MediaMetadata createMediaMetadata(PlaylistItem playlistItem) {
        return new MediaMetadataBuilder()
                .setId(IdPrefix.VIDEO + playlistItem.getSnippet().getResourceId().getVideoId())
                .setTitle(playlistItem.getSnippet().getTitle())
                .setTrackMetadata(new TrackMetadataBuilder()
                        .setAlbumArtURI(YT.getWorstThumbnailUrl(playlistItem.getSnippet().getThumbnails()))
                        .setDuration(1))
                .setMimeType("audio/aac")
                .setItemType(ItemType.TRACK)
                .build();
    }

}
