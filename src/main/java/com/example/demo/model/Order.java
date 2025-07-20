package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order") // optional but recommended
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private Date orderDate;

    private String status; // Placed, Processing, Dispatched, Delivered

    private String shippingAddress;

    private double totalAmount;
}
