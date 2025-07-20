package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {
    private Long id;
    private Long menuId;
    private String itemName;
    private Double price;
    private int quantity;
}
