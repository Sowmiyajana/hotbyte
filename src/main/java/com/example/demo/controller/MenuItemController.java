package com.example.demo.controller;

import com.example.demo.model.MenuItem;
import com.example.demo.model.Category;
import com.example.demo.model.Restaurant;
import com.example.demo.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "*")
public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @PostMapping
    public ResponseEntity<MenuItem> addMenuItem(@RequestBody MenuItem menuItem) {
        return ResponseEntity.ok(menuItemService.create(menuItem));
    }

    @GetMapping("/search")
    public ResponseEntity<List<MenuItem>> searchMenuItems(@RequestParam String keyword) {
        return ResponseEntity.ok(menuItemService.search(keyword));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<MenuItem>> getMenuByCategory(@PathVariable Long categoryId) {
        Category category = new Category();
        category.setId(categoryId);
        return ResponseEntity.ok(menuItemService.findByCategory(category));
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<MenuItem>> getMenuByRestaurant(@PathVariable Long restaurantId) {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(restaurantId);
        return ResponseEntity.ok(menuItemService.findByRestaurant(restaurant));
    }
}
