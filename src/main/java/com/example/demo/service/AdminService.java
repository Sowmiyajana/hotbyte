// AdminService.java
package com.example.demo.service;

import com.example.demo.model.Admin;

import java.util.Optional;

public interface AdminService {
    Optional<Admin> findByUsername(String username);
}
