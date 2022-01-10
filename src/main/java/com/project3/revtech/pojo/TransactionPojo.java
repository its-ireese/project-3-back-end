package com.project3.revtech.pojo;

import java.sql.Timestamp;

public class TransactionPojo {

    private int transactionId;
    private Timestamp transactionDate;
    private int cartId;

    public TransactionPojo(int transactionId, Timestamp transactionDate, int cartId) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.cartId = cartId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Override
    public String toString() {
        return "TransactionPojo{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", cartId=" + cartId +
                '}';
    }
}
