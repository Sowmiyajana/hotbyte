// CartServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.model.CartItem;
import com.example.demo.model.User;
import com.example.demo.repository.CartItemRepository;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem addItem(CartItem item) {
        return cartItemRepository.save(item);
    }

    public List<CartItem> getCartByUser(User user) {
        return cartItemRepository.findByUser(user);
    }

    public void removeItem(Long id) {
        cartItemRepository.deleteById(id);
    }

    public void clearCart(User user) {
        cartItemRepository.deleteByUser(user);
    }
}
