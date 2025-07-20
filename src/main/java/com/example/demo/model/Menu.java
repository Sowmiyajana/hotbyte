package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Menu") // optional but recommended
public class Menu{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String description;
    private String categoryName;
    private Double price;
    private String availabilityTime; // e.g., "All day", "Lunch hours"
    private String dietaryInfo;      // Veg / Nonveg
    private String tasteInfo;        // Spicy, Sweet, etc.
    private String nutritionalInfo;  // Calories, proteins, etc.

    private boolean outOfStock;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
