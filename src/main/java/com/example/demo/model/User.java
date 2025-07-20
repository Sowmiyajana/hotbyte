package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users") // optional but recommended
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gender;
    
    @Column(unique = true, nullable = false)
    private String email;

    private String password;
    private String contactNumber;
    private String address;

    private String role = "USER"; // default role
}
