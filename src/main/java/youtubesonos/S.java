package youtubesonos;

import base.Resources;

public class S {

    public static final String SMAPI_URL = "smapi_url";
    public static final String AUTH_RECEIVER_HOST = "auth_receiver_host";
    public static final String AUTH_RECEIVER_PORT = "auth_receiver_port";
    public static final String AUTH_RECEIVER_URL = "auth_receiver_url";
    public static final String AUTH_RECEIVER_CALLBACK_PATH = "auth_receiver_callback_path";
    public static final String MEDIA_SERVER_URL = "media_server_url";

    private static Resources resources;

    public static Resources getResources() {
        if (resources == null)
         resources = new Resources("Settings");

        return resources;
    }

}
