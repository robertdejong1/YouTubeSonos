package youtubesonos.youtube;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import youtubesonos.S;

import java.util.concurrent.ConcurrentHashMap;

public class YouTubeAuthReceiver {

    private static YouTubeAuthReceiver instance;

    private final int PORT;
    private final String HOST;
    private final String URL;
    private final String PATH;

    private ConcurrentHashMap<String, String> pendingLinkCodeUserIdMap;
    private ConcurrentHashMap<String, String> successLinkCodeUserIdMap;

    public static YouTubeAuthReceiver getInstance() {
        if (instance == null) {
            instance = new YouTubeAuthReceiver();
        }

        return instance;
    }

    private YouTubeAuthReceiver() {
        pendingLinkCodeUserIdMap = new ConcurrentHashMap<>();
        successLinkCodeUserIdMap = new ConcurrentHashMap<>();
        PORT = Integer.parseInt(S.getResources().getString(S.AUTH_RECEIVER_PORT));
        HOST = S.getResources().getString(S.AUTH_RECEIVER_HOST);
        PATH = S.getResources().getString(S.AUTH_RECEIVER_CALLBACK_PATH);
        URL = S.getResources().getString(S.AUTH_RECEIVER_URL);
    }

    public void initialize() throws Exception {
        Server server = new Server(PORT);
        for (Connector c : server.getConnectors()) {
            c.setHost(HOST);
        }
        server.addHandler(new YouTubeAuthReceiverHandler(this));

        server.start();
    }

    public String getRedirectUri() {
        if (!URL.isEmpty()) {
            return String.format("http://%s%s", URL, PATH);
        }

        return String.format("http://%s:%s%s", HOST, PORT, PATH);
    }

    public void addPendingLinkCodeUserId(String linkCode, String userId) {
        pendingLinkCodeUserIdMap.put(linkCode, userId);
    }

    public boolean pendingLinkCodeExists(String linkCode) {
        return pendingLinkCodeUserIdMap.containsKey(linkCode);
    }

    public boolean successLinkCodeExists(String linkCode) {
        return successLinkCodeUserIdMap.containsKey(linkCode);
    }

    public String getUserIdForSuccessLinkCode(String linkCode) {
        return successLinkCodeUserIdMap.get(linkCode);
    }

    public void onAuthReceived(String linkCode, String code) {
        if (pendingLinkCodeUserIdMap.containsKey(linkCode)) {
            try {
                String userId = pendingLinkCodeUserIdMap.get(linkCode);
                YT.authorizeNewUser(userId, code);
                successLinkCodeUserIdMap.put(linkCode, userId);
                pendingLinkCodeUserIdMap.remove(linkCode);

            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getPath() {
        return PATH;
    }

}
