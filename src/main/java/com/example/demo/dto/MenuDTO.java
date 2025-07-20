package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {
    private Long id;
    private String itemName;
    private String description;
    private String categoryName;
    private Double price;
    private String availabilityTime;
    private String dietaryInfo;
    private String tasteInfo;
    private String nutritionalInfo;
    private boolean outOfStock;
    private String restaurantName;
}
