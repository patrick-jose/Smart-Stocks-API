package com.smartstocks.smartstockscoreapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartstocks.smartstockscoreapi.configurations.security.Login;
import com.smartstocks.smartstockscoreapi.configurations.security.Token;
import com.smartstocks.smartstockscoreapi.configurations.security.TokenService;
import com.smartstocks.smartstockscoreapi.domains.user.User;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    @PostMapping("login")
    public ResponseEntity<Token> login(@Valid @RequestBody Login login) {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(login.email(), login.password());
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        return ResponseEntity.ok(new Token(tokenService.generateToken((User) authentication.getPrincipal())));
    }

    // @PostMapping("path")
    // public ResponseEntity<?> registerUser(@RequestBody String entity) {      
    //     return entity;
    // }
}