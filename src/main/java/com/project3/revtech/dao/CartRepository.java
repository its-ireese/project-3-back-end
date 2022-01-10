package com.project3.revtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project3.revtech.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    Cart findByCartId(int cartId);
    Cart findByCartIdAndCartRemovedFalseAndCartPaidFalse(int cartId);
    Cart findByUserIdAndCartRemovedFalseAndCartPaidFalse(int userId);
    Cart findByUserId(int userId);

}
