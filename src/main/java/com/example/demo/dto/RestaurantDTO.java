package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {
    private Long id;
    private String restaurantName;
    private String location;
    private String contactNumber;
    private String email;
}
