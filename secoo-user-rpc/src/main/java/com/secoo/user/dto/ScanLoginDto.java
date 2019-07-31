package com.secoo.user.dto;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:38
 * @desc
 */
public class ScanLoginDto extends AppBaseDto  {
    private Long shortUid;

    public ScanLoginDto() {
    }

    public Long getShortUid() {
        return this.shortUid;
    }

    public void setShortUid(Long shortUid) {
        this.shortUid = shortUid;
    }

    public String toString() {
        return "ScanLoginDto{shortUid=" + this.shortUid + '}';
    }
}
