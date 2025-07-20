package com.example.demo.dto;

import lombok.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long orderId;
    private Long userId;
    private String status;
    private Date orderDate;
    private String shippingAddress;
    private double totalAmount;
    private List<OrderItemDTO> items;
}
