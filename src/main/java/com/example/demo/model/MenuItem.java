package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data

@Entity
@Table(name = "menu_items")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private String availabilityTime; // e.g., "All Day", "Lunch", "Dinner"
    private String dietaryInfo; // Veg, Nonveg
    private String tasteInfo; // Spicy, Sweet, etc.
    private String nutritionalInfo;
    private boolean inStock;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Restaurant restaurant;

    // Getters, setters, constructors
}
