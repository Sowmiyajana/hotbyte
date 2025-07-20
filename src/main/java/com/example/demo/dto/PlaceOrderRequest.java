package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaceOrderRequest {
    private Long userId;
    private String shippingAddress;
    private List<OrderItemDTO> items;
}
