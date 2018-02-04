package youtubesonos.builders;

import base.Builder;
import smapi.AppLinkInfo;
import smapi.DeviceLinkCodeResult;

public class AppLinkInfoBuilder implements Builder<AppLinkInfo> {

    private AppLinkInfo result;

    public AppLinkInfoBuilder() {
        result = new AppLinkInfo();
    }

    public AppLinkInfoBuilder setDeviceLink(DeviceLinkCodeResult deviceLink) {
        result.setDeviceLink(deviceLink);
        return this;
    }

    public AppLinkInfoBuilder setDeviceLink(DeviceLinkCodeResultBuilder deviceLinkBuilder) {
        return setDeviceLink(deviceLinkBuilder.build());
    }

    public AppLinkInfoBuilder setAppUrlStringId(String appUrlStringId) {
        result.setAppUrlStringId(appUrlStringId);
        return this;
    }

    public AppLinkInfoBuilder setAppUrl(String appUrl) {
        result.setAppUrl(appUrl);
        return this;
    }

    @Override
    public AppLinkInfo build() {
        return result;
    }

}
