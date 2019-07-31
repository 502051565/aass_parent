package com.secoo.user.dto;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:15
 * @desc
 */
public class LoginCaptchaDto extends AppBaseDto {
    private String cck;
    private String ume;
    private String imgData;
    private String imgSuffix;

    public LoginCaptchaDto() {
    }

    public String getCck() {
        return this.cck;
    }

    public void setCck(String cck) {
        this.cck = cck;
    }

    public String getUme() {
        return this.ume;
    }

    public void setUme(String ume) {
        this.ume = ume;
    }

    public String getImgData() {
        return this.imgData;
    }

    public void setImgData(String imgData) {
        this.imgData = imgData;
    }

    public String getImgSuffix() {
        return this.imgSuffix;
    }

    public void setImgSuffix(String imgSuffix) {
        this.imgSuffix = imgSuffix;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("LoginCaptchaDto{");
        sb.append("cck='").append(this.cck).append('\'');
        sb.append(", ume='").append(this.ume).append('\'');
        sb.append(", imgData='").append(this.imgData).append('\'');
        sb.append(", imgSuffix='").append(this.imgSuffix).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
