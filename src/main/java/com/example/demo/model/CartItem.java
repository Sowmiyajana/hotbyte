package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private MenuItem menuItem;

    private int quantity;

    // Getters, setters, constructors
}
