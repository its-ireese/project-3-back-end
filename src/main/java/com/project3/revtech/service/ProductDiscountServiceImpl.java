package com.project3.revtech.service;

import com.project3.revtech.dao.DiscountRepository;
import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.entity.Discount;
import com.project3.revtech.entity.Product;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.joinedPojo.ProductAndDiscountPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ProductDiscountServiceImpl  implements ProductDiscountService{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    DiscountRepository discountRepository;

    public ProductDiscountServiceImpl() {}

    @Override
    public List<ProductAndDiscountPojo> getAllDiscountedProducts() throws ApplicationException {
        //get  our JPA built in method findAll() to discountedItem
        List<Discount> discountedItem = discountRepository.findAll();
        //Build a list of P&DPo
        List<ProductAndDiscountPojo> allDiscountedProducts = new ArrayList<>();

        //Loop to find/get any discounted product
        discountedItem.forEach((discount) -> {
            Product product = discount.getProduct();
            ProductAndDiscountPojo productPojo = new  ProductAndDiscountPojo(
                    product.getProductId(),
                    product.getProductSku(),
                    product.getProductName(),
                    product.getProductCost(),
                    product.getProductCategory(),
                    product.getProductDescription(),
                    product.getProductQty(),
                    product.getImageUrl(),
                    product.isProductRemoved(),
                    discount.getDiscountId(),
                    discount.getDiscountDescription(),
                    discount.getDiscountPercentage());
            //add them to the list
            allDiscountedProducts.add(productPojo);
        });
        //return them
        return allDiscountedProducts;
    }

   //-------How to get a one discounted product
    @Override
    public ProductAndDiscountPojo getOneProductWithDiscount(int productId) throws ApplicationException {
        Product getAnewProduct = productRepository.getById(productId);

        //discount
        Discount discountedProduct = (getAnewProduct.getDiscount() == null ? new Discount(true) : getAnewProduct.getDiscount());

        //create a new product & a  DiscountPojo
        ProductAndDiscountPojo newProdDiscPojo = new ProductAndDiscountPojo(
                getAnewProduct.getProductId(),
                getAnewProduct.getProductSku(),
                getAnewProduct.getProductName(),
                getAnewProduct.getProductCost(),
                getAnewProduct.getProductCategory(),
                getAnewProduct.getProductDescription(),
                getAnewProduct.getProductQty(),
                getAnewProduct.getImageUrl(),
                getAnewProduct.isProductRemoved(),
                discountedProduct.getDiscountId(),
                discountedProduct.getDiscountDescription(),
                discountedProduct.getDiscountPercentage());

        return newProdDiscPojo;
    }
}
