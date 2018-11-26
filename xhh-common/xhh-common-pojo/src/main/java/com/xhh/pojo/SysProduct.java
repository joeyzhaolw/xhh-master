package com.xhh.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SysProduct {
    private Integer productId;

    private String productModel;

    private Integer productStock;

    private String productName;

    private Integer productCatId;

    private BigDecimal productCostPrice;

    private BigDecimal productSuggestedPrice;

    private String productDepTeam;

    private Date productDepTime;

    private String productMemo;

    private Integer adminUserId;

    private Date productCreatTime;

    private Integer productStatus;

    private String productMainImagePath;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel == null ? null : productModel.trim();
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductCatId() {
        return productCatId;
    }

    public void setProductCatId(Integer productCatId) {
        this.productCatId = productCatId;
    }

    public BigDecimal getProductCostPrice() {
        return productCostPrice;
    }

    public void setProductCostPrice(BigDecimal productCostPrice) {
        this.productCostPrice = productCostPrice;
    }

    public BigDecimal getProductSuggestedPrice() {
        return productSuggestedPrice;
    }

    public void setProductSuggestedPrice(BigDecimal productSuggestedPrice) {
        this.productSuggestedPrice = productSuggestedPrice;
    }

    public String getProductDepTeam() {
        return productDepTeam;
    }

    public void setProductDepTeam(String productDepTeam) {
        this.productDepTeam = productDepTeam == null ? null : productDepTeam.trim();
    }

    public Date getProductDepTime() {
        return productDepTime;
    }

    public void setProductDepTime(Date productDepTime) {
        this.productDepTime = productDepTime;
    }

    public String getProductMemo() {
        return productMemo;
    }

    public void setProductMemo(String productMemo) {
        this.productMemo = productMemo == null ? null : productMemo.trim();
    }

    public Integer getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public Date getProductCreatTime() {
        return productCreatTime;
    }

    public void setProductCreatTime(Date productCreatTime) {
        this.productCreatTime = productCreatTime;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductMainImagePath() {
        return productMainImagePath;
    }

    public void setProductMainImagePath(String productMainImagePath) {
        this.productMainImagePath = productMainImagePath == null ? null : productMainImagePath.trim();
    }
}