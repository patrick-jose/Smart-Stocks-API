package com.smartstocks.smartstockscoreapi.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.smartstocks.smartstockscoreapi.configurations.security.Login;
import com.smartstocks.smartstockscoreapi.configurations.security.Token;
import com.smartstocks.smartstockscoreapi.configurations.security.TokenService;
import com.smartstocks.smartstockscoreapi.domains.user.CreateUserDTO;
import com.smartstocks.smartstockscoreapi.domains.user.User;
import com.smartstocks.smartstockscoreapi.services.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    private final UserService userService;

    @PostMapping("login")
    public ResponseEntity<Token> login(@Valid @RequestBody Login login) {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(login.email(), login.password());
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        return ResponseEntity.ok(new Token(tokenService.generateToken((User) authentication.getPrincipal())));
    }

    @PostMapping("register")
    public ResponseEntity<Void> register(@Valid @RequestBody CreateUserDTO dto) {
        User user = this.userService.createUser(new User(dto));
        URI uri = UriComponentsBuilder.fromPath("/v1/users/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}