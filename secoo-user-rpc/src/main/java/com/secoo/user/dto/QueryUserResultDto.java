package com.secoo.user.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:30
 * @desc
 */
public class QueryUserResultDto implements Serializable {
    private List<UserDto> list;
    private Integer count;

    public QueryUserResultDto() {
    }

    public List<UserDto> getList() {
        return this.list;
    }

    public void setList(List<UserDto> list) {
        this.list = list;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String toString() {
        return "QueryUserResultDto{list=" + this.list + ", count=" + this.count + '}';
    }
}
