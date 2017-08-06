package youtubesonos.builders;

import smapi.MediaMetadata;
import smapi.TrackMetadata;

public class MediaMetadataBuilder extends AbstractMediaBuilder<MediaMetadata, MediaMetadataBuilder> {

    public MediaMetadataBuilder() {
        result = new MediaMetadata();
    }

    public MediaMetadataBuilder setMimeType(String mimeType) {
        result.setMimeType(mimeType);
        return this;
    }

    public MediaMetadataBuilder setTrackMetadata(TrackMetadata trackMetadata) {
        result.setTrackMetadata(trackMetadata);
        return this;
    }

    public MediaMetadataBuilder setTrackMetadata(TrackMetadataBuilder trackMetadataBuilder) {
        return setTrackMetadata(trackMetadataBuilder.build());
    }

    @Override
    protected MediaMetadataBuilder getThis() {
        return this;
    }
}
