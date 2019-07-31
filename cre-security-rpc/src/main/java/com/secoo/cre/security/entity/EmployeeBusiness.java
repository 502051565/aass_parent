package com.secoo.cre.security.entity;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:05
 * @desc
 */
public class EmployeeBusiness implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;

    private int employeeId;

    private long businessId;

    private String businessName;

    private String supplierCode;

    private int systemType;

    private String operationSystemId;

    public EmployeeBusiness() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public long getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(long businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return this.businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getSystemType() {
        return this.systemType;
    }

    public void setSystemType(int systemType) {
        this.systemType = systemType;
    }

    public String getOperationSystemId() {
        return this.operationSystemId;
    }

    public void setOperationSystemId(String operationSystemId) {
        this.operationSystemId = operationSystemId;
    }

    public String getSupplierCode() {
        return this.supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String toString() {
        return "EmployeeBusiness [id=" + this.id + ", employeeId=" + this.employeeId + ", businessId=" + this.businessId + ", businessName=" + this.businessName + ", supplierCode=" + this.supplierCode + ", systemType=" + this.systemType + ", operationSystemId=" + this.operationSystemId + "]";
    }

}
