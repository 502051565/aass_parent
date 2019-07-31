package com.secoo.chaos.api.base.constant;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:51
 * @desc
 */
public enum RetCodeEnum {
    RET_SYS_SUCCESS(0, "success"),
    RET_CAST_ERROR(400, "Type Mismatch"),
    RET_REQUEST_ERROR(405, "Http Request Method Not Supported"),
    RET_SYS_ERROR(500, "Server exception"),
    RET_PARAM_ERROR(510, "Abnormal parameter or empty"),
    RET_RESULT_EMPTY(1001, "The result is empty");

    private int code;
    private String msg;

    private RetCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public static RetCodeEnum getSupplierEnumById(Integer id) {
        RetCodeEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            RetCodeEnum codeEnum = var1[var3];
            if (null != id && codeEnum.getCode() == id) {
                return codeEnum;
            }
        }

        return null;
    }

}
