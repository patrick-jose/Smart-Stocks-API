package com.smartstocks.smartstockscoreapi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartstocks.smartstockscoreapi.domains.benchmark.Benchmark;
import com.smartstocks.smartstockscoreapi.services.BenchmarkService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/benchmarks")
public class BenchmarkController {

    private final BenchmarkService benchmarkService;

    @GetMapping
    public ResponseEntity<List<Benchmark>> findAll() {
        return ResponseEntity.ok(this.benchmarkService.findAll());
    }
}