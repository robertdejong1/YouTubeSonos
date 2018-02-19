package youtubesonos.requesthandlers;

import com.google.api.services.youtube.model.Playlist;
import com.google.api.services.youtube.model.PlaylistLocalization;
import smapi.CustomFault;
import smapi.ItemType;
import smapi.MediaList;
import youtubesonos.IdPrefix;
import youtubesonos.SonosApi;
import youtubesonos.builders.MediaCollectionBuilder;
import youtubesonos.builders.MediaListBuilder;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class AbstractMetadataRequestHandler extends AbstractRequestHandler {

    private String id;
    private int index, count;
    private MediaListBuilder builder;

    public AbstractMetadataRequestHandler(String userId, SonosApi sonosApi, String id, int index, int count) {
        super(userId, sonosApi);
        this.id = id;
        this.index = index;
        this.count = count;
        builder = new MediaListBuilder().setIndex(index);
    }

    public MediaList handle() throws CustomFault {
        return builder.setCalculatedCount().build();
    }

    public String getId() {
        return id;
    }

    public int getIndex() {
        return index;
    }

    public int getCount() {
        return count;
    }

    public MediaListBuilder getBuilder() {
        return builder;
    }

    protected void addMediaCollection(Playlist playlist) {
        getBuilder().addMedia(new MediaCollectionBuilder()
                .setId(IdPrefix.PLAYLIST + playlist.getId())
                .setTitle(getLocalizedTitle(playlist))
                .setItemType(ItemType.PLAYLIST)
                .setAlbumArtURI(playlist.getSnippet().getThumbnails().getDefault().getUrl())
                .setCanPlay(true));
    }

    protected String getLocalizedTitle(Playlist playlist) {
        if (playlist.getLocalizations() != null) {
            Map<String, PlaylistLocalization> localizations = playlist.getLocalizations();
            List<Locale> locales = getSonosApi().getLocales();

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
}
