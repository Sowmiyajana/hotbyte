// MenuItemService.java
package com.example.demo.service;

import com.example.demo.model.MenuItem;
import com.example.demo.model.Category;
import com.example.demo.model.Restaurant;

import java.util.List;

public interface MenuItemService {
    MenuItem create(MenuItem item);
    List<MenuItem> findByRestaurant(Restaurant restaurant);
    List<MenuItem> findByCategory(Category category);
    List<MenuItem> search(String keyword);
    void delete(Long id);
}
