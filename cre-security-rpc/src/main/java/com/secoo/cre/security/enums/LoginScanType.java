package com.secoo.cre.security.enums;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:10
 * @desc
 */
public enum LoginScanType {
    LOGIN(1, "登录"),
    BINDING(2, "绑定"),
    ERROR(3, "异常");

    private int value;
    private String viewName;

    private LoginScanType(int value, String viewName) {
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
        LoginScanType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            LoginScanType type = var1[var3];
            if (type.value == value) {
                return type.viewName;
            }
        }

        return null;
    }
}
