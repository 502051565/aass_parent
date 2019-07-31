package com.secoo.user.dto;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:15
 * @desc
 */
public class AppBaseDto extends BaseDto  {
    protected String platform;
    protected String platformVer;
    protected String deviceId;
    protected String channel;
    protected String appId;
    protected String appVer;
    protected String sysVer;

    public AppBaseDto() {
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformVer() {
        return this.platformVer;
    }

    public void setPlatformVer(String platformVer) {
        this.platformVer = platformVer;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public String getSysVer() {
        return this.sysVer;
    }

    public void setSysVer(String sysVer) {
        this.sysVer = sysVer;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("AppBaseDto{");
        sb.append("platform='").append(this.platform).append('\'');
        sb.append(", platformVer='").append(this.platformVer).append('\'');
        sb.append(", deviceId='").append(this.deviceId).append('\'');
        sb.append(", channel='").append(this.channel).append('\'');
        sb.append(", appId='").append(this.appId).append('\'');
        sb.append(", appVer='").append(this.appVer).append('\'');
        sb.append(", sysVer='").append(this.sysVer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
