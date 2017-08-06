package youtubesonos.builders;

import base.Builder;
import smapi.AbstractMedia;
import smapi.ItemType;

public abstract class AbstractMediaBuilder<T extends AbstractMedia, B extends AbstractMediaBuilder<T, B>> implements Builder<T> {

    protected T result;

    protected abstract B getThis();

    public B setId(String id) {
        result.setId(id);
        return getThis();
    }

    public B setItemType(ItemType itemType){
        result.setItemType(itemType);
        return getThis();
    }

    public B setDisplayType(String displayType) {
        result.setDisplayType(displayType);
        return getThis();
    }

    public B setTitle(String title) {
        result.setTitle(title);
        return getThis();
    }

    @Override
    public T build() {
        return result;
    }

}