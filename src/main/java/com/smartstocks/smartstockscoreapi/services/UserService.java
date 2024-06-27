package com.smartstocks.smartstockscoreapi.services;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.role.Role;
import com.smartstocks.smartstockscoreapi.domains.user.User;
import com.smartstocks.smartstockscoreapi.repositories.RoleRepository;
import com.smartstocks.smartstockscoreapi.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User createUser(User user) {
        Role role = roleRepository.findById(1L).orElseThrow(() -> new RuntimeException("Role not found"));
        user.setRoles(Collections.singleton(role));
        return userRepository.save(user);
    }

    public User getUserPortfolio(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    public User createPortfolio(User user) {
        return userRepository.save(user);
    }
}