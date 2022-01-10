package com.project3.revtech.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project3.revtech.pojo.DiscountPojo;
import com.project3.revtech.dao.DiscountRepository;
import com.project3.revtech.entity.Discount;
import com.project3.revtech.entity.Product;
import com.project3.revtech.exception.ApplicationException;


@Service
@Transactional
public class DiscountServiceImpl implements DiscountService{
	
	
	
	@Autowired
	DiscountRepository discountRepository;
	
	public DiscountServiceImpl(){
		
	}
	
	
	//Get all Discounts
	@Override
	public List<DiscountPojo> getAllDiscounts(){
		List<Discount> allDiscountsEntity = this.discountRepository.findAll();
		List<DiscountPojo>  allDiscountsPojo = new ArrayList<DiscountPojo>();
		System.out.println(allDiscountsEntity);
		allDiscountsEntity.forEach((discount) -> {
			DiscountPojo productPojo = new DiscountPojo(discount.getDiscountId()
					,discount.getProductId(),discount.getDiscountDescription(),discount.getDiscountPercentage());
			
			allDiscountsPojo.add(productPojo);
			
		});
		
		return allDiscountsPojo;
	}
	

	//ADD DISCOUNTS TO PRODUCT
	@Override
	public DiscountPojo addDiscount(DiscountPojo product) throws ApplicationException {
		
		Discount newDiscount = new Discount(0,product.getProductId(),null, product.getDiscountDescription(),product.getDiscountPercentage());
		
//		Discount returnDiscount =
		discountRepository.saveAndFlush(newDiscount);
		
		return product;
	}

	//REMOVE DISCOUNT
	@Override
	public boolean removeDiscount(int discId) throws ApplicationException {
		this.discountRepository.deleteById(discId);
		return true;
	}


	@Override
	public DiscountPojo updateDiscount(DiscountPojo discountPojo) throws ApplicationException {
        Discount updateDiscount = new  Discount(
                discountPojo.getDiscountId(),discountPojo.getProductId(),discountPojo.getDiscountDescription(),
                discountPojo.getDiscountPercentage());
        //Entity Discount object
        discountRepository.save(updateDiscount);
        return discountPojo;
	}

}
