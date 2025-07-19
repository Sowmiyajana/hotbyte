package com.example.demo.repository;

import com.example.demo.model.MenuItem;
import com.example.demo.model.Restaurant;
import com.example.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByRestaurant(Restaurant restaurant);
    List<MenuItem> findByCategory(Category category);
    List<MenuItem> findByNameContainingIgnoreCase(String keyword);
}
