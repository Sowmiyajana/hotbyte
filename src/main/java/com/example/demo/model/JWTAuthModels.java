package com.example.demo.model;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class JwtRequest {
    private String username;
    private String password;
    // Getters and setters
}

public class JwtResponse {
    private String token;
    // Getters and setters
}
