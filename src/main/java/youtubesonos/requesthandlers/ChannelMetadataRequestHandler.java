package youtubesonos.requesthandlers;

import com.google.api.services.youtube.model.*;
import smapi.CustomFault;
import smapi.ItemType;
import smapi.MediaList;
import youtubesonos.IdPrefix;
import youtubesonos.R;
import youtubesonos.SonosApi;
import youtubesonos.SonosFaults;
import youtubesonos.builders.MediaCollectionBuilder;
import youtubesonos.youtube.YT;

import java.io.IOException;
import java.util.*;

public class ChannelMetadataRequestHandler extends AbstractMetadataRequestHandler {

    private int total = 0;
    private Map<String, MediaCollectionBuilder> channelSectionMediaCollectionBuilders;
    private List<String> singlePlayListIds;

    public ChannelMetadataRequestHandler(String userId, SonosApi sonosApi, String id, int index, int count) {
        super(userId, sonosApi, id, index, count);
        channelSectionMediaCollectionBuilders = new LinkedHashMap<>();
        singlePlayListIds = new ArrayList<>();
    }

    @Override
    public MediaList handle() throws CustomFault {
        addPlaylistsCollection();
        addRelatedPlaylists();
        addChannelSections();

        getBuilder().setTotal(total);

        return super.handle();
    }

    private void addPlaylistsCollection() {
        getBuilder().addMedia(new MediaCollectionBuilder()
                .setId(IdPrefix.CHANNELPLAYLISTS + getId())
                .setTitle(R.getResources().getString(R.PLAYLISTS, getSonosApi().getLocales()))
                .setItemType(ItemType.CONTAINER)
        );
        total++;
    }

    private void addRelatedPlaylists() throws CustomFault {
        try {
            ChannelListResponse response = YT.getChannelInfo(getId(), getUserId());
            if (response.getItems().isEmpty()) {
                throw SonosFaults.ITEM_NOT_FOUND;
            }

            addLikesPlaylist(response.getItems().get(0).getContentDetails().getRelatedPlaylists());
            addFavoritesPlaylist(response.getItems().get(0).getContentDetails().getRelatedPlaylists());
            addUploadsPlaylist(response.getItems().get(0).getContentDetails().getRelatedPlaylists());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void addLikesPlaylist(ChannelContentDetails.RelatedPlaylists relatedPlaylists) {
        String playListId = relatedPlaylists.getLikes();
        if (playListId != null) {
            getBuilder().addMedia(createCollectionBuilderForPlaylistId(playListId, R.getResources().getString(R.LIKES, getSonosApi().getLocales())));
            total++;
        }
    }

    private void addFavoritesPlaylist(ChannelContentDetails.RelatedPlaylists relatedPlaylists) {
        String playListId = relatedPlaylists.getFavorites();
        if (playListId != null) {
            getBuilder().addMedia(createCollectionBuilderForPlaylistId(playListId, R.getResources().getString(R.FAVORITES, getSonosApi().getLocales())));
            total++;
        }
    }

    private void addUploadsPlaylist(ChannelContentDetails.RelatedPlaylists relatedPlaylists) {
        String playListId = relatedPlaylists.getUploads();
        if (playListId != null) {
            getBuilder().addMedia(createCollectionBuilderForPlaylistId(playListId, R.getResources().getString(R.UPLOADS, getSonosApi().getLocales())));
            total++;
        }
    }

    private MediaCollectionBuilder createCollectionBuilderForPlaylistId(String playListId, String title) {
        return new MediaCollectionBuilder()
                .setId(IdPrefix.PLAYLIST + playListId)
                .setTitle(title)
                .setItemType(ItemType.CONTAINER);
    }

    private void addChannelSections() {
        try {
            ChannelSectionListResponse response = YT.getChannelSections(getId(), getUserId());
            for (ChannelSection channelSection : response.getItems()) {
                switch (channelSection.getSnippet().getType()) {
                    case "singlePlaylist": addSinglePlayListChannelSection(channelSection); break;
                    case "multiplePlaylists": addMultiplePlaylistsChannelSection(channelSection); break;
                    //TODO: support more channelSectionTypes
                }
            }
            addChannelSectionBuilders();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addSinglePlayListChannelSection(ChannelSection channelSection) {
        String playListId = channelSection.getContentDetails().getPlaylists().get(0);
        channelSectionMediaCollectionBuilders.put(IdPrefix.PLAYLIST + playListId, createCollectionBuilderForPlaylistId(playListId, ""));
        singlePlayListIds.add(playListId);
    }

    private void addMultiplePlaylistsChannelSection(ChannelSection channelSection) {
        channelSectionMediaCollectionBuilders.put(IdPrefix.MULTIPLE_PLAYLISTS + channelSection.getId(), new MediaCollectionBuilder()
                .setId(IdPrefix.MULTIPLE_PLAYLISTS + channelSection.getId())
                .setTitle(channelSection.getSnippet().getTitle())
                .setItemType(ItemType.CONTAINER)
        );
    }

    private void addChannelSectionBuilders() throws IOException {
        fillSinglePlayListData();
        for (MediaCollectionBuilder builder : channelSectionMediaCollectionBuilders.values()) {
            getBuilder().addMedia(builder);
            total++;
        }
    }

    private void fillSinglePlayListData() throws IOException {
        PlaylistListResponse playListResponse = YT.getPlaylistInfo(String.join(",", singlePlayListIds), getUserId());
        for (Playlist playList : playListResponse.getItems()) {
            MediaCollectionBuilder mediaCollectionBuilder = channelSectionMediaCollectionBuilders.get(IdPrefix.PLAYLIST + playList.getId());
            mediaCollectionBuilder.setTitle(getLocalizedTitle(playList));
            mediaCollectionBuilder.setAlbumArtURI(YT.getWorstThumbnailUrl(playList.getSnippet().getThumbnails()));
        }
    }

}
