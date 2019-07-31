package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:53
 * @desc
 */
public class PageCriteria implements Serializable {
    private static final long serialVersionUID = -2432639023254065098L;
    public static final String START = "startIndex";
    public static final String SIZE = "pageSize";
    private int pageNumber = 1;
    private int pageSize = 10;

    public PageCriteria() {
    }

    public int getStartIndex() {
        return this.getPageSize() * (this.pageNumber - 1);
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String toString() {
        return "PageCriteria{pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + '}';
    }

}
