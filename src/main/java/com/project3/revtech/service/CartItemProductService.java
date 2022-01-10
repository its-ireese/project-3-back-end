package com.project3.revtech.service;

import com.project3.revtech.joinedPojo.CartAndItemsPojo;

public interface CartItemProductService {

    CartAndItemsPojo getAllCartItemProducts(int cartId);
    CartAndItemsPojo getAllCartItemProductsForUser(int userId);


}
