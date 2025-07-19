package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gender;
    private String email;
    private String password;
    private String contactNumber;
    private String address;

    private String role; // USER, ADMIN

    // Getters, setters, constructors
}
