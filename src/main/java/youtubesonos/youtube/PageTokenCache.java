package youtubesonos.youtube;

import java.util.*;

public class PageTokenCache {

    private final List<PageTokenCacheItem> pageTokenCacheItems;

    public PageTokenCache() {
        pageTokenCacheItems = Collections.synchronizedList(new ArrayList<>());
    }

    public PageTokenCacheItem getItem(int pageIndex) {
        synchronized (pageTokenCacheItems) {
            for (PageTokenCacheItem item : pageTokenCacheItems) {
                if (item.getPageIndex() == pageIndex)
                    return item;
                else {
                    PageTokenCacheItem nextItem = null;
                    int nextIndex = pageTokenCacheItems.indexOf(item) + 1;
                    if (pageTokenCacheItems.size() >= (nextIndex + 1)) {
                        nextItem = pageTokenCacheItems.get(nextIndex);
                    }

                    if ((item.getPageIndex() < pageIndex && (nextItem == null)) || (nextItem != null && nextItem.getPageIndex() > pageIndex))
                        return item;
                }
            }
        }

        return null;
    }

    private PageTokenCacheItem getItemAbsolute(int pageIndex) {
        synchronized (pageTokenCacheItems) {
            for (PageTokenCacheItem item : pageTokenCacheItems) {
                if (item.getPageIndex() == pageIndex)
                    return item;
                if (item.getPageIndex() > pageIndex)
                    break;
            }
        }

        return null;
    }

    public void setPageToken(int pageIndex, String pageToken) {
        PageTokenCacheItem item = getItemAbsolute(pageIndex);
        if (item != null) {
            item.setPageToken(pageToken);
        }
        else {
            pageTokenCacheItems.add(new PageTokenCacheItem(pageIndex, pageToken));
            Collections.sort(pageTokenCacheItems);
        }
    }

}
