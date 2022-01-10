package com.project3.revtech.joinedPojo;

import java.util.List;

public class CartAndItemsPojo {
    private int cartId;
    private int userId;
    private int cartTotal;
    private boolean cartPaid;
    private boolean cartRemoved;
    private List<ItemProductDiscountPojo> cartItems;

    public CartAndItemsPojo(int cartId, int userId, int cartTotal, boolean cartPaid, boolean cartRemoved, List<ItemProductDiscountPojo> cartItems) {
        this.cartId = cartId;
        this.userId = userId;
        this.cartTotal = cartTotal;
        this.cartPaid = cartPaid;
        this.cartRemoved = cartRemoved;
        this.cartItems = cartItems;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(int cartTotal) {
        this.cartTotal = cartTotal;
    }

    public boolean isCartPaid() {
        return cartPaid;
    }

    public void setCartPaid(boolean cartPaid) {
        this.cartPaid = cartPaid;
    }

    public boolean isCartRemoved() {
        return cartRemoved;
    }

    public void setCartRemoved(boolean cartRemoved) {
        this.cartRemoved = cartRemoved;
    }

    public List<ItemProductDiscountPojo> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<ItemProductDiscountPojo> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public String toString() {
        return "CartAndItemsPojo{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", cartTotal=" + cartTotal +
                ", cartPaid=" + cartPaid +
                ", cartRemoved=" + cartRemoved +
                ", cartItems=" + cartItems +
                '}';
    }
}
