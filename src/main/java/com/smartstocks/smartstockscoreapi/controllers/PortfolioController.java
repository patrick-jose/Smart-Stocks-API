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
import com.smartstocks.smartstockscoreapi.domains.portfolio.Portfolio;
import com.smartstocks.smartstockscoreapi.domains.user.User;
import com.smartstocks.smartstockscoreapi.services.PortfolioService;
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
    private final PortfolioService portfolioService;

    // @GetMapping
    // public ResponseEntity<DetailsPortfolioDTO> getPortfolio(@RequestHeader("Authorization") String token) {
    //     Long id = tokenService.getLoggedUserId(token);
    //     return ResponseEntity.ok(new CreatePortfolioDTO(userService.getUserPortfolio(id)));
    // }

    @PostMapping
    public ResponseEntity<?> createPortfolio(@RequestHeader("Authorization") String token, @RequestBody CreatePortfolioDTO dto) {
        Portfolio portfolio = this.portfolioService.createPortfolio(new Portfolio(dto));
        URI uri = UriComponentsBuilder.fromPath("/v1/portfolios/{id}").buildAndExpand(portfolio.getId()).toUri();
        return ResponseEntity.created(uri).body(portfolio);
    }
}