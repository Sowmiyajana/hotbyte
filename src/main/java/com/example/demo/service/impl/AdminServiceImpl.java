// AdminServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Optional<Admin> findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}
