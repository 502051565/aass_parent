package com.secoo.product.api.product.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:57
 * @desc
 */
public class RpcOperUser implements Serializable {

    private static final long serialVersionUID = 7001091905310822442L;
    public static final String BIZ_SELF_ADD = "BizCodeSelfAdd";
    public static final String BIZ_COOP_SYNC = "BizCodeCoopSyncAdd";
    private String srcAppName;
    private String srcAppBizCode;
    private Long userId;
    private String userName;
    private String loginName;
    private Date operDate;

    public RpcOperUser() {
    }

    public RpcOperUser(String srcAppName, String srcAppBizCode, Long userId, String userName, String loginName) {
        this.srcAppName = srcAppName;
        this.srcAppBizCode = srcAppBizCode;
        this.userId = userId;
        this.userName = userName;
        this.loginName = loginName;
    }

    public String validate() {
        StringBuilder sb = new StringBuilder();
        if (this.srcAppName == null || this.srcAppName.trim().length() == 0) {
            sb.append("srcAppName is requried,");
        }

        if (this.srcAppBizCode == null || this.srcAppBizCode.trim().length() == 0) {
            sb.append("srcAppBizCode is requried,");
        }

        if (this.userName == null || this.userName.trim().length() == 0) {
            sb.append("userName is requried,");
        }

        if (this.userId == null) {
            sb.append("userId is requried,");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    public String getSrcAppName() {
        return this.srcAppName;
    }

    public void setSrcAppName(String srcAppName) {
        this.srcAppName = srcAppName;
    }

    public String getSrcAppBizCode() {
        return this.srcAppBizCode;
    }

    public void setSrcAppBizCode(String srcAppBizCode) {
        this.srcAppBizCode = srcAppBizCode;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getOperDate() {
        return this.operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RpcOperUser [srcAppName=").append(this.srcAppName).append(", srcAppBizCode=").append(this.srcAppBizCode).append(", userId=").append(this.userId).append(", userName=").append(this.userName).append(", operDate=").append(this.operDate).append("]");
        return builder.toString();
    }
}
