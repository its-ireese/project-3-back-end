package com.project3.revtech.service;

import javax.transaction.Transactional;

import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.entity.Product;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.ProductPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductServiceImpl(){}

    @Override
    public ProductPojo addProductService(ProductPojo productPojo) throws ApplicationException {
      Product  newProduct= null;
        newProduct = new  Product(
                productPojo.getProductId(), productPojo.getProductSku(),
                productPojo.getProductName(), productPojo.getProductCost(),
                productPojo.getProductCategory(), productPojo.getProductDescription(),
                productPojo.getProductQty(), productPojo.getImageUrl(),
                productPojo.isProductRemoved());
        //Entity Product object
        Product returnProduct = productRepository.saveAndFlush(newProduct);
        productPojo.setProductId(returnProduct.getProductId());
        return productPojo;
    }

    @Override
    public ProductPojo updateProductService(ProductPojo productPojo) throws ApplicationException {
         Product updateProduct = new  Product(
                productPojo.getProductId(), productPojo.getProductSku(),
                productPojo.getProductName(), productPojo.getProductCost(),
                productPojo.getProductCategory(), productPojo.getProductDescription(),
                productPojo.getProductQty(), productPojo.getImageUrl(),
                productPojo.isProductRemoved());
        //Entity Product object
        Product returnProduct = productRepository.save(updateProduct);
        return productPojo;
    }
    @Override
    public boolean deleteProductService(int productId) throws ApplicationException {
        this.productRepository.deleteById(productId);
        return true;
    }

    @Override
    public ProductPojo getAProductService(int productId) throws ApplicationException {
        ProductPojo productPojo = null;
        Optional<Product> optional = this.productRepository.findById(productId);
        if (optional.isPresent()) {
            Product product = optional.get();
            productPojo = new  ProductPojo(product.getProductId(), product.getProductSku(),
                    product.getProductName(), product.getProductCost(),
                    product.getProductCategory(), product.getProductDescription(),
                    product.getProductQty(), product.getImageUrl(),
                    product.isProductRemoved());
        }
        return  productPojo;
    }

    @Override
    public List<ProductPojo> getAllProductService() throws ApplicationException {
        List<Product> allProductEntity = this.productRepository.findAll();
        List<ProductPojo> allProductPojo = new ArrayList<>();
        allProductEntity.forEach((product) -> {
           ProductPojo productPojo = new  ProductPojo(product.getProductId(), product.getProductSku(),
                    product.getProductName(), product.getProductCost(),
                    product.getProductCategory(), product.getProductDescription(),
                    product.getProductQty(), product.getImageUrl(),
                    product.isProductRemoved());
           allProductPojo.add(productPojo);
        });
        return allProductPojo;
    }

    //------------Will add more custom methods below later if needed
    @Override
    public ProductPojo getADiscountProductService(int productId) throws ApplicationException {
        ProductPojo productPojo = null;
        Optional<Product> optional = this.productRepository.findById(productId);
        if (optional.isPresent()) {
            Product product = optional.get();
            productPojo = new  ProductPojo(product.getProductId(), product.getProductSku(),
                    product.getProductName(), product.getProductCost(),
                    product.getProductCategory(), product.getProductDescription(),
                    product.getProductQty(), product.getImageUrl(),
                    product.isProductRemoved());
        }
        return  productPojo;
    }

    @Override
    public List<ProductPojo> getAllDiscountProductService() throws ApplicationException {
        List<Product> allProductEntity = this.productRepository.findAll();
        List<ProductPojo> allProductPojo = new ArrayList<>();
        allProductEntity.forEach((product) -> {
            ProductPojo productPojo = new  ProductPojo(product.getProductId(), product.getProductSku(),
                    product.getProductName(), product.getProductCost(),
                    product.getProductCategory(), product.getProductDescription(),
                    product.getProductQty(), product.getImageUrl(),
                    product.isProductRemoved());
            allProductPojo.add(productPojo);
        });
        return allProductPojo;
    }
}
