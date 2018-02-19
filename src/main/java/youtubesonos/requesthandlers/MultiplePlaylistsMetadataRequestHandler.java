package youtubesonos.requesthandlers;

import com.google.api.services.youtube.model.ChannelSectionListResponse;
import com.google.api.services.youtube.model.Playlist;
import com.google.api.services.youtube.model.PlaylistListResponse;
import smapi.CustomFault;
import smapi.MediaList;
import youtubesonos.SonosApi;
import youtubesonos.SonosFaults;
import youtubesonos.youtube.YT;

import java.io.IOException;
import java.util.List;

public class MultiplePlaylistsMetadataRequestHandler extends AbstractMetadataRequestHandler {

    public MultiplePlaylistsMetadataRequestHandler(String userId, SonosApi sonosApi, String id, int index, int count) {
        super(userId, sonosApi, id, index, count);
    }

    @Override
    public MediaList handle() throws CustomFault {
        try {
            ChannelSectionListResponse response = YT.getChannelSectionInfo(getId(), getUserId());
            if (response.getItems().isEmpty()) {
                throw SonosFaults.ITEM_NOT_FOUND;
            }

            List<String> playlistIds = response.getItems().get(0).getContentDetails().getPlaylists();
            PlaylistListResponse playlistInfo = YT.getPlaylistInfo(String.join(",", playlistIds), getUserId());
            getBuilder().setTotal(playlistInfo.getItems().size());
            for (Playlist playlist : playlistInfo.getItems()) {
                addMediaCollection(playlist);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return super.handle();
    }
}
