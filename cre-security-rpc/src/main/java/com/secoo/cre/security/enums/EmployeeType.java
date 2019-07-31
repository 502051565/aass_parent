package com.secoo.cre.security.enums;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:02
 * @desc
 */
public enum EmployeeType {
    OPERATE(1, "运营"),
    BUSINESS_MAIN_ACCOUNT(2, "商家主账号"),
    BUSINESS_SMALL_ACCOUNT(3, "商家子账号"),
    LIVE_BROADCAST_ADMIN(4, "直播管理员");

    private int value;
    private String viewName;

    private EmployeeType(int value, String viewName) {
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
        EmployeeType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            EmployeeType type = var1[var3];
            if (type.value == value) {
                return type.viewName;
            }
        }

        return null;
    }
}
