package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantRegisterRequest {
    private String restaurantName;
    private String location;
    private String contactNumber;
    private String email;
    private String password;
}
