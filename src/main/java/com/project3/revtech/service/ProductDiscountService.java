package com.project3.revtech.service;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;

import java.util.List;

public interface ProductDiscountService {

    //get all products & join them with discount row
    List<ProductAndDiscountPojo> getAllDiscountedProducts() throws ApplicationException;

    //get all products & join them with discount row
    ProductAndDiscountPojo  getOneProductWithDiscount(int productId) throws ApplicationException;
}
