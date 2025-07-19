// RestaurantService.java
package com.example.demo.service;

import com.example.demo.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    Restaurant register(Restaurant restaurant);
    Optional<Restaurant> getByEmail(String email);
    List<Restaurant> getAll();
    void delete(Long id);
}
