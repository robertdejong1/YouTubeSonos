package youtubesonos.builders;

import smapi.AlbumArtUrl;
import smapi.MediaCollection;

public class MediaCollectionBuilder extends AbstractMediaBuilder<MediaCollection, MediaCollectionBuilder> {

    public MediaCollectionBuilder() {
        result = new MediaCollection();
    }

    public MediaCollectionBuilder setAlbumArtURI(String albumArtUri) {
        AlbumArtUrl albumArtUrl = new AlbumArtUrl();
        albumArtUrl.setValue(albumArtUri);
        result.setAlbumArtURI(albumArtUrl);
        return this;
    }

    public MediaCollectionBuilder setCanPlay(boolean canPlay) {
        result.setCanPlay(canPlay);
        return this;
    }

    @Override
    protected MediaCollectionBuilder getThis() {
        return this;
    }
}
