package youtubesonos.requesthandlers;

import youtubesonos.SonosApi;

public abstract class AbstractRequestHandler {

    private String userId;
    private SonosApi sonosApi;

    public AbstractRequestHandler(String userId, SonosApi sonosApi) {
        this.userId = userId;
        this.sonosApi = sonosApi;
    }

    public String getUserId() {
        return userId;
    }

    public SonosApi getSonosApi() {
        return sonosApi;
    }
}
