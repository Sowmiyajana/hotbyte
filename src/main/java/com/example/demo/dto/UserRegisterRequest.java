package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterRequest {
    private String name;
    private String gender;
    private String email;
    private String password;
    private String contactNumber;
    private String address;
}
