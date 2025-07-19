package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String shippingAddress;
    private LocalDateTime orderTime;
    private String status; // Pending, Processing, Dispatched, Delivered
    private Double totalAmount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    // Getters, setters, constructors
}
