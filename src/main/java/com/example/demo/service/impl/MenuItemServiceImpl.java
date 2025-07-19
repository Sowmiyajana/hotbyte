// MenuItemServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.model.MenuItem;
import com.example.demo.model.Restaurant;
import com.example.demo.model.Category;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;

    public MenuItem create(MenuItem item) {
        return menuItemRepository.save(item);
    }

    public List<MenuItem> findByRestaurant(Restaurant restaurant) {
        return menuItemRepository.findByRestaurant(restaurant);
    }

    public List<MenuItem> findByCategory(Category category) {
        return menuItemRepository.findByCategory(category);
    }

    public List<MenuItem> search(String keyword) {
        return menuItemRepository.findByNameContainingIgnoreCase(keyword);
    }

    public void delete(Long id) {
        menuItemRepository.deleteById(id);
    }
}
