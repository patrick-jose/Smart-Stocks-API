package com.smartstocks.smartstockscoreapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartstocks.smartstockscoreapi.services.BenchmarkService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/testes")
public class Teste {

    private final BenchmarkService benchmarkService;
    // private final InvestmentService investmentService;
    // private final InvestmentHistoryService investmentHistoryService;
    // private final InvestmentTypeService investmentTypeService;
    // private final PortfolioService portfolioService;
    // private final PortfolioCompositionService portfolioCompositionService;
    // private final UserService userService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(benchmarkService.findAll());
    }
}