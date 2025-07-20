package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private Long menuId;
    private String itemName;
    private int quantity;
    private double price;
}
