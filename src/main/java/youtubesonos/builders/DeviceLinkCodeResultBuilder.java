package youtubesonos.builders;

import base.Builder;
import smapi.DeviceLinkCodeResult;

public class DeviceLinkCodeResultBuilder implements Builder<DeviceLinkCodeResult> {

    private DeviceLinkCodeResult result;

    public DeviceLinkCodeResultBuilder() {
        result = new DeviceLinkCodeResult();
    }

    public DeviceLinkCodeResultBuilder setLinkCode(String linkCode) {
        result.setLinkCode(linkCode);
        return this;
    }

    public DeviceLinkCodeResultBuilder setRegUrl(String regUrl) {
        result.setRegUrl(regUrl);
        return this;
    }

    @Override
    public DeviceLinkCodeResult build() {
        return result;
    }

}
