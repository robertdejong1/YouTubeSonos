package youtubesonos;

import base.Resources;

public class S {

    public static final String WEB_SERVER_HOST = "web_server_host";
    public static final String WEB_SERVER_PORT = "web_server_port";
    public static final String WEB_SERVER_URL = "web_server_url";
    public static final String SMAPI_PATH = "smapi_path";
    public static final String AUTH_PATH = "auth_path";
    public static final String MEDIA_SERVER_URL = "media_server_url";

    private static Resources resources;

    public static Resources getResources() {
        if (resources == null)
         resources = new Resources("Settings");

        return resources;
    }

}
