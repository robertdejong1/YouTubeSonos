package youtubesonos.youtube;

import base.AbstractHttpHandler;
import base.ResourceHttpHandler;
import com.sun.net.httpserver.HttpExchange;
import youtubesonos.S;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class YouTubeAuthHttpHandler extends AbstractHttpHandler {

    private static YouTubeAuthHttpHandler instance;

    public static YouTubeAuthHttpHandler getInstance() {
        if (instance == null) {
            instance = new YouTubeAuthHttpHandler();
        }
        return instance;
    }

    private ConcurrentHashMap<String, String> pendingLinkCodeUserIdMap;
    private ConcurrentHashMap<String, String> successLinkCodeUserIdMap;

    private YouTubeAuthHttpHandler() {
        pendingLinkCodeUserIdMap = new ConcurrentHashMap<>();
        successLinkCodeUserIdMap = new ConcurrentHashMap<>();
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

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        Map<String, String> params = queryToMap(httpExchange.getRequestURI().getQuery());
        String linkCode = params.getOrDefault("state", "");

        if (!linkCode.isEmpty() && pendingLinkCodeExists(linkCode)) {
            String code = params.getOrDefault("code", "");
            String error = params.getOrDefault("error", "");

            if (!code.isEmpty() && error.isEmpty()) {
                handleValidAuth(linkCode, code);
                new ResourceHttpHandler("/Auth_Success.html").handle(httpExchange);
                return;
            }
        }

        new ResourceHttpHandler("/Auth_Failure.html").handle(httpExchange);
    }

    public void handleValidAuth(String linkCode, String code) {
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

    public String getRedirectUri() {
        return S.getResources().getString(S.WEB_SERVER_URL) + S.getResources().getString(S.AUTH_PATH);
    }
}
