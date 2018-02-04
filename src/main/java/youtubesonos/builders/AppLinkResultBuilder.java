package youtubesonos.builders;

import base.Builder;
import smapi.AppLinkInfo;
import smapi.AppLinkResult;

public class AppLinkResultBuilder implements Builder<AppLinkResult> {

    private AppLinkResult result;

    public AppLinkResultBuilder() {
        result = new AppLinkResult();
    }

    public AppLinkResultBuilder setAuthorizeAccount(AppLinkInfo authorizeAccount) {
        result.setAuthorizeAccount(authorizeAccount);
        return this;
    }

    public AppLinkResultBuilder setAuthorizeAccount(AppLinkInfoBuilder authorizeAccountBuilder) {
        return setAuthorizeAccount(authorizeAccountBuilder.build());
    }

    public AppLinkResultBuilder setCreateAccount(AppLinkInfo createAccount) {
        result.setCreateAccount(createAccount);
        return this;
    }

    public AppLinkResultBuilder setCreateAccount(AppLinkInfoBuilder createAccountBuilder) {
        return setCreateAccount(createAccountBuilder.build());
    }

    @Override
    public AppLinkResult build() {
        return result;
    }

}
