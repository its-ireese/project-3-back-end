package com.project3.revtech.pojo;

import java.math.BigDecimal;

public class DiscountPojo {

    private int discountId;
    private int productId;
    private String discountDescription;
    private BigDecimal discountPercentage;

    public DiscountPojo(int discountId, int productId, String discountDescription, BigDecimal discountPercentage) {
        this.discountId = discountId;
        this.productId = productId;
        this.discountDescription = discountDescription;
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
        return "DiscountPojo{" +
                "discountId=" + discountId +
                ", productId=" + productId +
                ", discountDescription='" + discountDescription + '\'' +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
