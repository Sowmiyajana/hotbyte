package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddToCartRequest {
    private Long userId;
    private Long menuId;
    private int quantity;
}
