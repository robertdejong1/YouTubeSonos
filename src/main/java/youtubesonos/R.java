package youtubesonos;

import base.Resources;

public class R {

    public static final String POPULAR_MUSIC = "popular_music";
    public static final String PLAYLISTS = "playlists";
    public static final String SUBSCRIPTIONS = "subscriptions";
    public static final String CHANNELS = "channels";
    public static final String VIDEOS = "videos";
    public static final String LIKES = "likes";
    public static final String FAVORITES = "favorites";
    public static final String UPLOADS = "uploads";

    private static Resources resources;

    public static Resources getResources() {
        if (resources == null)
            resources = new Resources("Strings");

        return resources;
    }
}
