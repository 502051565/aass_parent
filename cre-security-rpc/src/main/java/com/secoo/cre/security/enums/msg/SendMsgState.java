package com.secoo.cre.security.enums.msg;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:11
 * @desc
 */
public enum SendMsgState {
    SUCCESS(1, "成功"),
    USER_NOT_EXIST(2, "用户不存在"),
    UNBOUND_PHONE(3, "未绑定手机号"),
    SEND_TIME_ERROR(4, "60S内不需要重新发送"),
    SEND_ERROR(5, "异常");

    private int value;
    private String viewName;

    private SendMsgState(int value, String viewName) {
        this.value = value;
        this.viewName = viewName;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getViewName() {
        return this.viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public static String name(int value) {
        SendMsgState[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            SendMsgState type = var1[var3];
            if (type.value == value) {
                return type.viewName;
            }
        }

        return null;
    }
}
