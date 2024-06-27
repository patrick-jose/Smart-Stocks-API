package com.smartstocks.smartstockscoreapi.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.smartstocks.smartstockscoreapi.configurations.security.TokenService;
import com.smartstocks.smartstockscoreapi.domains.portfolio.CreatePortfolioDTO;
import com.smartstocks.smartstockscoreapi.domains.portfolio.DetailsPortfolioDTO;
import com.smartstocks.smartstockscoreapi.services.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/portfolios")
public class PortfolioController {

    private final TokenService tokenService;
    private final UserService userService;

    // @GetMapping
    // public ResponseEntity<DetailsPortfolioDTO> getPortfolio(@RequestHeader("Authorization") String token) {
    //     Long id = tokenService.getLoggedUserId(token);
    //     return ResponseEntity.ok(new CreatePortfolioDTO(userService.getUserPortfolio(id)));
    // }

    // @PostMapping
    // public ResponseEntity<CreatePortfolioDTO> createPortfolio(@RequestHeader("Authorization") String token) {
    //     User user = this.userService.save(new User(registerUserDTO));
    //     URI uri = UriComponentsBuilder.fromPath("/v1/users/{id}").buildAndExpand(user.getId()).toUri();
    //     return ResponseEntity.created(uri).body(new DetailsUserDTO(user));
    //     return entity;
    // }
}