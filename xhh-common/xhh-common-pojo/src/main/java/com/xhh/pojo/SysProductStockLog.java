package com.xhh.pojo;

import java.util.Date;

public class SysProductStockLog {
    private Integer stockLogId;

    private Integer productId;

    private Integer adminUserId;

    private Integer stockLogNum;

    private String stockLogLogistics;

    private String stockLogBill;

    private String stockLogCompany;

    private String stockLogName;

    private String stockLogPhone;

    private String stockLogAddress;

    private Date stockLogTime;

    private Integer stockInOrOut;

    private Integer stockLogChangeNum;

    public Integer getStockLogId() {
        return stockLogId;
    }

    public void setStockLogId(Integer stockLogId) {
        this.stockLogId = stockLogId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public Integer getStockLogNum() {
        return stockLogNum;
    }

    public void setStockLogNum(Integer stockLogNum) {
        this.stockLogNum = stockLogNum;
    }

    public String getStockLogLogistics() {
        return stockLogLogistics;
    }

    public void setStockLogLogistics(String stockLogLogistics) {
        this.stockLogLogistics = stockLogLogistics == null ? null : stockLogLogistics.trim();
    }

    public String getStockLogBill() {
        return stockLogBill;
    }

    public void setStockLogBill(String stockLogBill) {
        this.stockLogBill = stockLogBill == null ? null : stockLogBill.trim();
    }

    public String getStockLogCompany() {
        return stockLogCompany;
    }

    public void setStockLogCompany(String stockLogCompany) {
        this.stockLogCompany = stockLogCompany == null ? null : stockLogCompany.trim();
    }

    public String getStockLogName() {
        return stockLogName;
    }

    public void setStockLogName(String stockLogName) {
        this.stockLogName = stockLogName == null ? null : stockLogName.trim();
    }

    public String getStockLogPhone() {
        return stockLogPhone;
    }

    public void setStockLogPhone(String stockLogPhone) {
        this.stockLogPhone = stockLogPhone == null ? null : stockLogPhone.trim();
    }

    public String getStockLogAddress() {
        return stockLogAddress;
    }

    public void setStockLogAddress(String stockLogAddress) {
        this.stockLogAddress = stockLogAddress == null ? null : stockLogAddress.trim();
    }

    public Date getStockLogTime() {
        return stockLogTime;
    }

    public void setStockLogTime(Date stockLogTime) {
        this.stockLogTime = stockLogTime;
    }

    public Integer getStockInOrOut() {
        return stockInOrOut;
    }

    public void setStockInOrOut(Integer stockInOrOut) {
        this.stockInOrOut = stockInOrOut;
    }

    public Integer getStockLogChangeNum() {
        return stockLogChangeNum;
    }

    public void setStockLogChangeNum(Integer stockLogChangeNum) {
        this.stockLogChangeNum = stockLogChangeNum;
    }
}