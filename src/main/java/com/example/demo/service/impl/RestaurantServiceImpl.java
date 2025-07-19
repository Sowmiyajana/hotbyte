// RestaurantServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepository;
import com.example.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant register(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Optional<Restaurant> getByEmail(String email) {
        return restaurantRepository.findByEmail(email);
    }

    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    public void delete(Long id) {
        restaurantRepository.deleteById(id);
    }
}
