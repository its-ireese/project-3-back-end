package com.project3.revtech.pojo;


public class CartItemPojo {

    private int cartItemId;
    private int cartId;
    private int productId;
    private int cartQty;

    public CartItemPojo(int cartItemId, int cartId, int productId, int cartQty) {
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.productId = productId;
        this.cartQty = cartQty;
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

    @Override
    public String toString() {
        return "CartItemPojo{" +
                "cartItemId=" + cartItemId +
                ", cartId=" + cartId +
                ", productId=" + productId +
                ", cartQty=" + cartQty +
                '}';
    }
}
