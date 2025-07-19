package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data


@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Breakfast, Lunch, Pizza, Arabian, etc.

    // Getters, setters, constructors
}
