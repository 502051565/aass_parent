package com.secoo.cre.security.enums;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:12
 * @desc
 */
public enum LoginType {
    VAL_CODE(1, "验证码登录"),
    SCAN(2, "扫码绑定登录");

    private int value;
    private String viewName;

    private LoginType(int value, String viewName) {
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
        LoginType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            LoginType type = var1[var3];
            if (type.value == value) {
                return type.viewName;
            }
        }

        return null;
    }
}
