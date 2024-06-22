package com.smartstocks.smartstockscoreapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartstocks.smartstockscoreapi.services.InvestmentTypeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/testes")
public class Teste {

    // private final BenchmarkService benchmarkService;
    // private final InvestmentService investmentService;
    // private final InvestmentHistoryService investmentHistoryService;
    private final InvestmentTypeService investmentTypeService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(investmentTypeService.findAll());
    }
}