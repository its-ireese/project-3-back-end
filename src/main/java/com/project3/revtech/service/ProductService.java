package com.project3.revtech.service;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.ProductPojo;

import java.util.List;

public interface ProductService {
    ProductPojo addProductService(ProductPojo productPojo) throws ApplicationException;
    ProductPojo updateProductService(ProductPojo productPojo) throws ApplicationException;
    boolean deleteProductService(int productId) throws ApplicationException;
    ProductPojo getAProductService(int  productId) throws ApplicationException;
    List<ProductPojo> getAllProductService() throws ApplicationException;

    //------Will add more custom Product service methods ----------//

    ProductPojo getADiscountProductService(int  productId) throws ApplicationException;
    List<ProductPojo> getAllDiscountProductService() throws ApplicationException;



}
