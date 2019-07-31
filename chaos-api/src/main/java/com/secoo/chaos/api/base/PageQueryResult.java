package com.secoo.chaos.api.base;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:49
 * @desc
 */
public class PageQueryResult<T> implements Serializable {

    private static final long serialVersionUID = -5212488136524468886L;
    private List<T> datas;
    private Boolean isLastPage;
    private Integer total = 0;
    private int pageNumber = 1;
    private int pageSize = 10;
    private Integer pageCount = 1;

    public PageQueryResult(int total, int pageSize, int pageNumber) {
        this.total = total;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        if (this.pageNumber < 1) {
            this.pageNumber = 1;
        }

        if (this.total <= 0) {
            this.total = 0;
        }

        if (this.total <= (this.pageNumber - 1) * this.pageSize) {
            this.pageNumber = (this.total + this.pageSize - 1) / this.pageSize;
            if (this.pageNumber < 1) {
                this.pageNumber = 1;
            }
        }

        this.pageCount = (this.total + this.pageSize - 1) / this.pageSize;
        if (this.pageCount != 0 && this.pageCount != this.pageNumber) {
            this.isLastPage = false;
        } else {
            this.isLastPage = true;
        }

    }

    public PageQueryResult(List<T> data, int pageSize, int pageNumber) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        if (this.pageNumber < 1) {
            this.pageNumber = 1;
        }

        this.datas = data;
        if (data != null && data.size() != 0) {
            if (data.size() <= pageSize) {
                this.total = (this.pageNumber - 1) * this.pageSize + data.size();
            } else {
                this.total = this.pageNumber * this.pageSize + 1;
            }
        } else {
            this.total = (this.pageNumber - 1) * this.pageSize;
        }

        this.pageCount = (this.total + this.pageSize - 1) / this.pageSize;
        this.isLastPage = this.pageNumber == this.pageCount;
    }

    public PageQueryResult() {
    }

    public List<T> getDatas() {
        return this.datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public Boolean getIsLastPage() {
        return this.isLastPage;
    }

    public void setIsLastPage(Boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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

    public Integer getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PageQueryResult [datas=").append(this.datas).append(", isLastPage=").append(this.isLastPage).append(", total=").append(this.total).append(", pageNumber=").append(this.pageNumber).append(", pageSize=").append(this.pageSize).append(", pageCount=").append(this.pageCount).append("]");
        return builder.toString();
    }
}
