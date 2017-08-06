
import javax.xml.ws.Endpoint;

import youtubesonos.S;
import youtubesonos.youtube.YouTubeAuthReceiver;
import youtubesonos.SonosApi;

import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        YouTubeAuthReceiver.getInstance().initialize();
        Endpoint.publish(S.getResources().getString(S.SMAPI_URL), new SonosApi());
    }
}
