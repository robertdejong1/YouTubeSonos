package youtubesonos.builders;

import base.Builder;
import smapi.AlbumArtUrl;
import smapi.TrackMetadata;

public class TrackMetadataBuilder implements Builder<TrackMetadata> {

    private TrackMetadata result;

    public TrackMetadataBuilder() {
        result = new TrackMetadata();
    }

    public TrackMetadataBuilder setAlbumArtURI(String url) {
        AlbumArtUrl albumArtUrl = new AlbumArtUrl();
        albumArtUrl.setValue(url);
        result.setAlbumArtURI(albumArtUrl);
        return this;
    }

    public TrackMetadataBuilder setArtist(String artist) {
        result.setArtist(artist);
        return this;
    }

    public TrackMetadataBuilder setArtistId(String artistId) {
        result.setArtistId(artistId);
        return this;
    }

    public TrackMetadataBuilder setDuration(int duration) {
        result.setDuration(duration);
        return this;
    }

    @Override
    public TrackMetadata build() {
        return result;
    }
}
