// CartService.java
package com.example.demo.service;

import com.example.demo.model.CartItem;
import com.example.demo.model.User;

import java.util.List;

public interface CartService {
    CartItem addItem(CartItem item);
    List<CartItem> getCartByUser(User user);
    void removeItem(Long id);
    void clearCart(User user);
}
