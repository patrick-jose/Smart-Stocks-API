package com.smartstocks.smartstockscoreapi.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.benchmark.Benchmark;
import com.smartstocks.smartstockscoreapi.repositories.BenchmarkRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BenchmarkService {

    private final BenchmarkRepository benchmarkRepository;

    public Page<Benchmark> findAll(Pageable pageable) {
        return this.benchmarkRepository.findAll(pageable);
    }
}