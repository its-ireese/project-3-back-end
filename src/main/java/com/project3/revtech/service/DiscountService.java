package com.project3.revtech.service;

import java.util.List;

import com.project3.revtech.pojo.DiscountPojo;
import com.project3.revtech.exception.ApplicationException;
 

public interface DiscountService {

	
	List<DiscountPojo> getAllDiscounts() throws ApplicationException;
	DiscountPojo addDiscount(DiscountPojo discountPojo) throws ApplicationException;
	DiscountPojo updateDiscount(DiscountPojo newDiscountPojo) throws ApplicationException;
	boolean removeDiscount(int discId) throws ApplicationException;
}
