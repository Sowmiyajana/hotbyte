package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data


@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private MenuItem menuItem;

    private int quantity;
    private double price;

    // Getters, setters, constructors
}
