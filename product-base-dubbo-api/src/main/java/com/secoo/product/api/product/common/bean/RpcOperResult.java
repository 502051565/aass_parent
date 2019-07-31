package com.secoo.product.api.product.common.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:56
 * @desc
 */
public class RpcOperResult<T> implements Serializable {

    private static final long serialVersionUID = 8204020380996991030L;
    public static final int PARAM_ERROR = -1;
    public static final int SYS_ERROR = -2;
    private Boolean flag = true;
    private T datas;
    private Integer code;
    private String msg;

    public RpcOperResult() {
    }

    public T getDatas() {
        return this.datas;
    }

    public void setDatas(T datas) {
        this.datas = datas;
    }

    public Boolean getFlag() {
        return this.flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RpcOperResult [flag=").append(this.flag).append(", datas=").append(this.datas).append(", code=").append(this.code).append(", msg=").append(this.msg).append("]");
        return builder.toString();
    }
}
