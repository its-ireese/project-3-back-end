package com.project3.revtech.service;

import javax.transaction.Transactional;

import com.project3.revtech.dao.CartRepository;
import com.project3.revtech.entity.Cart;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.CartPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public CartPojo addCart(CartPojo cart) throws ApplicationException {
        Cart cartEntity = new Cart(cart.getCartId(), cart.getUserId(), cart.getCartTotal(), cart.isCartPaid(), cart.isCartRemoved());
        Cart returnCart = cartRepository.saveAndFlush(cartEntity);
        cart.setCartId(returnCart.getCartId());
        return cart;
    }

    @Override
    public CartPojo updateCart(CartPojo cart) throws ApplicationException {
        Cart cartEntity = new Cart(cart.getCartId(), cart.getUserId(), cart.getCartTotal(), cart.isCartPaid(), cart.isCartRemoved());
        Cart returnCart = cartRepository.saveAndFlush(cartEntity);
        cart.setCartId(returnCart.getCartId());
        return cart;
    }

    @Override
    public CartPojo getCart(int cartId) throws ApplicationException {
        Cart cartEntity =  cartRepository.findByCartId(cartId);
        CartPojo cart = new CartPojo(cartEntity.getCartId(), cartEntity.getUserId(), cartEntity.getCartTotal(), cartEntity.isCartPaid(), cartEntity.isCartRemoved());
        return cart;
    }

    @Override
    public CartPojo getCartByUserId(int userId) throws ApplicationException {
        Cart cartEntity =  cartRepository.findByUserId(userId);
        if(cartEntity == null) {
            CartPojo newCart = new CartPojo(-1, userId, 0, false, false);
            return addCart(newCart);
        }
        CartPojo cart = new CartPojo(cartEntity.getCartId(), cartEntity.getUserId(), cartEntity.getCartTotal(), cartEntity.isCartPaid(), cartEntity.isCartRemoved());
        return cart;
    }

    @Override
    public boolean removeCart(CartPojo cart) throws ApplicationException {
        cartRepository.deleteById(cart.getCartId());
        return true;
    }
}
