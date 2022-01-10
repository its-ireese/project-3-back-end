package com.project3.revtech.joinedPojo;

import java.math.BigDecimal;

public class ProductAndDiscountPojo {

    private int productId;
    private String productSku;
    private String productName;
    private BigDecimal productCost;
    private String productCategory;
    private String productDescription;
    private int productQty;
    private String imageUrl;
    private boolean productRemoved;
    private int discountId;
    private String discountDescription;
    private BigDecimal discountPercentage;

    public ProductAndDiscountPojo(int productId, String productSku, String productName, BigDecimal productCost, String productCategory, String productDescription, int productQty, String imageUrl, boolean productRemoved, int discountId, String discountDescription, BigDecimal discountPercentage) {
        this.productId = productId;
        this.productSku = productSku;
        this.productName = productName;
        this.productCost = productCost;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productQty = productQty;
        this.imageUrl = imageUrl;
        this.productRemoved = productRemoved;
        this.discountId = discountId;
        this.discountDescription = discountDescription;
        this.discountPercentage = discountPercentage;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductCost() {
        return productCost;
    }

    public void setProductCost(BigDecimal productCost) {
        this.productCost = productCost;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isProductRemoved() {
        return productRemoved;
    }

    public void setProductRemoved(boolean productRemoved) {
        this.productRemoved = productRemoved;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public String getDiscountDescription() {
        return discountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "ProductAndDiscountPojo{" +
                "productId=" + productId +
                ", productSku='" + productSku + '\'' +
                ", productName='" + productName + '\'' +
                ", productCost=" + productCost +
                ", productCategory='" + productCategory + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productQty=" + productQty +
                ", imageUrl='" + imageUrl + '\'' +
                ", productRemoved=" + productRemoved +
                ", discountId=" + discountId +
                ", discountDescription='" + discountDescription + '\'' +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
