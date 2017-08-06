package youtubesonos.youtube;

public class PageTokenCacheItem implements Comparable<PageTokenCacheItem> {

    private int pageIndex;
    private String pageToken;

    public PageTokenCacheItem(int pageIndex, String pageToken) {
        this.pageIndex = pageIndex;
        this.pageToken = pageToken;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public String getPageToken() {
        return pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    @Override
    public int compareTo(PageTokenCacheItem o) {
        return Integer.compare(pageIndex, o.getPageIndex());
    }
}
