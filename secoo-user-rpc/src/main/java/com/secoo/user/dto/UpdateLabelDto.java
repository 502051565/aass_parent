package com.secoo.user.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:36
 * @desc
 */
public class UpdateLabelDto implements Serializable {
    private Long userId;
    private String modify;
    private List<LabelFieldDto> list;

    public UpdateLabelDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<LabelFieldDto> getList() {
        return this.list;
    }

    public void setList(List<LabelFieldDto> list) {
        this.list = list;
    }

    public String getModify() {
        return this.modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

    public String toString() {
        return "UpdateLabelDto{userId=" + this.userId + ", modify='" + this.modify + '\'' + ", list=" + this.list + '}';
    }
}
