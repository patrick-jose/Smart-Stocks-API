package com.smartstocks.smartstockscoreapi.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public ResponseEntity<Page<Benchmark>> findAll(@PageableDefault(size = 10) Pageable pageable) {
        return ResponseEntity.ok(this.benchmarkService.findAll(pageable));
    }
}