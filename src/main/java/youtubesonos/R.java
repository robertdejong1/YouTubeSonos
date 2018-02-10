package youtubesonos;

import base.Resources;

public class R {

    public static final String POPULAR_MUSIC = "popular_music";
    public static final String PLAYLISTS = "playlists";
    public static final String SUBSCRIPTIONS = "subscriptions";
    public static final String CHANNELS = "channels";
    public static final String VIDEOS = "videos";

    private static Resources resources;

    public static Resources getResources() {
        if (resources == null)
            resources = new Resources("Strings");

        return resources;
    }
}
