package com.secoo.product.api.product.common;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:58
 * @desc
 */
public enum SpuBizSrcEnum {

    NORMAL(1000, "寺库自营"),
    ESC(1001, "欧洲自营"),
    GSC(1002, "全球自营"),
    KULIVE(1003, "寺库生活"),
    O2O(1004, "O2O"),
    C2C(1005, "C2C"),
    LSS(1006, "边拍边卖");

    private Integer code;
    private String name;

    private SpuBizSrcEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer code() {
        return this.code;
    }
}
