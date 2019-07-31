package com.secoo.chaos.api.base;

import com.secoo.chaos.api.base.constant.RetCodeEnum;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:50
 * @desc
 */
public class ApiRet<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer retCode;
    private String retMsg;
    private T data;

    public ApiRet(RetCodeEnum codeEnum) {
        this.retCode = 0;
        this.retMsg = "";
        this.retCode = codeEnum.getCode();
        this.retMsg = codeEnum.getMsg();
    }

    public ApiRet(RetCodeEnum codeEnum, String retMsg) {
        this.retCode = 0;
        this.retMsg = "";
        this.retCode = codeEnum.getCode();
        this.retMsg = retMsg;
    }

    public ApiRet(int code, String retMsg) {
        this.retCode = 0;
        this.retMsg = "";
        this.retCode = code;
        this.retMsg = retMsg;
    }

    public ApiRet(RetCodeEnum codeEnum, String retMsg, T data) {
        this(codeEnum, retMsg);
        this.data = data;
    }

    public static <T> ApiRet<T> success(T data) {
        return new ApiRet(RetCodeEnum.RET_SYS_SUCCESS, "", data);
    }

    public static <T> ApiRet<T> error() {
        return new ApiRet(RetCodeEnum.RET_SYS_ERROR, RetCodeEnum.RET_SYS_ERROR.getMsg());
    }

    public static <T> ApiRet<T> error(RetCodeEnum codeEnum, String msg) {
        return new ApiRet(codeEnum, RetCodeEnum.RET_SYS_ERROR.getMsg());
    }

    public static <T> ApiRet<T> error(int code, String msg) {
        return new ApiRet(code, RetCodeEnum.RET_SYS_ERROR.getMsg());
    }

    public static <T> ApiRet<T> error(String msg) {
        return new ApiRet(RetCodeEnum.RET_SYS_ERROR, msg);
    }

    public static <T> ApiRet<T> resultEmpty(String msg) {
        return new ApiRet(RetCodeEnum.RET_RESULT_EMPTY, msg);
    }

    public static <T> ApiRet<T> status(RetCodeEnum codeEnum, String retMsg) {
        return new ApiRet(codeEnum, retMsg);
    }

    public static <T> ApiRet<T> status(RetCodeEnum codeEnum) {
        return new ApiRet(codeEnum, codeEnum.getMsg());
    }

    public Integer getRetCode() {
        return this.retCode;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public T getData() {
        return this.data;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiRet() {
        this.retCode = 0;
        this.retMsg = "";
    }

}
