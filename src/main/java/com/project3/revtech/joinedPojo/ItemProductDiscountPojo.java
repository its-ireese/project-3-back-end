package com.project3.revtech.joinedPojo;

public class ItemProductDiscountPojo {
    private int cartItemId;
    private int cartId;
    private int productId;
    private int cartQty;
    private ProductAndDiscountPojo productAndDiscount;

    public ItemProductDiscountPojo(int cartItemId, int cartId, int productId, int cartQty, ProductAndDiscountPojo productAndDiscount) {
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.productId = productId;
        this.cartQty = cartQty;
        this.productAndDiscount = productAndDiscount;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCartQty() {
        return cartQty;
    }

    public void setCartQty(int cartQty) {
        this.cartQty = cartQty;
    }

    public ProductAndDiscountPojo getProductAndDiscount() {
        return productAndDiscount;
    }

    public void setProductAndDiscount(ProductAndDiscountPojo productAndDiscount) {
        this.productAndDiscount = productAndDiscount;
    }

    @Override
    public String toString() {
        return "ItemProductDiscountPojo{" +
                "cartItemId=" + cartItemId +
                ", cartId=" + cartId +
                ", productId=" + productId +
                ", cartQty=" + cartQty +
                ", productAndDiscount=" + productAndDiscount +
                '}';
    }
}
