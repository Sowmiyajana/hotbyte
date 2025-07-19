package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String contactNumber;
    private String email;
    private String password;

    // Getters, setters, constructors
}
