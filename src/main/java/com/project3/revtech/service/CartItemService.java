package com.project3.revtech.service;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.CartItemPojo;

public interface CartItemService {


    CartItemPojo addItem(CartItemPojo item) throws ApplicationException;
    CartItemPojo updateItem(CartItemPojo item) throws ApplicationException;
    boolean removeItem(int itemId) throws ApplicationException;
    boolean checkIfExistsInCart(int cartId, int productId) throws ApplicationException;
    boolean checkIfNoQty(int cartId, int productId) throws ApplicationException;

}
