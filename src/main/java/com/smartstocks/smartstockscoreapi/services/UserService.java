package com.smartstocks.smartstockscoreapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.user.User;
import com.smartstocks.smartstockscoreapi.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}