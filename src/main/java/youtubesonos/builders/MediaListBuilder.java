package youtubesonos.builders;

import base.Builder;
import smapi.AbstractMedia;
import smapi.MediaList;

public class MediaListBuilder implements Builder<MediaList> {

    private MediaList result;

    public MediaListBuilder() {
        result = new MediaList();
    }

    public MediaListBuilder setIndex(int index) {
        result.setIndex(index);
        return this;
    }

    public MediaListBuilder setCount(int count) {
        result.setCount(count);
        return this;
    }

    public MediaListBuilder setCalculatedCount() {
        return setCount(result.getMediaCollectionOrMediaMetadata().size());
    }

    public MediaListBuilder setTotal(int total) {
        result.setTotal(total);
        return this;
    }

    public MediaListBuilder addMedia(AbstractMedia media) {
        result.getMediaCollectionOrMediaMetadata().add(media);
        return this;
    }

    public MediaListBuilder addMedia(AbstractMediaBuilder mediaBuilder) {
        return addMedia((AbstractMedia) mediaBuilder.build());
    }

    @Override
    public MediaList build() {
        return result;
    }

}
