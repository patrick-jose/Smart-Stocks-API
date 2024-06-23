package com.smartstocks.smartstockscoreapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.benchmark.Benchmark;
import com.smartstocks.smartstockscoreapi.repositories.BenchmarkRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BenchmarkService {

    private final BenchmarkRepository benchmarkRepository;

    public List<Benchmark> findAll() {
        return this.benchmarkRepository.findAll();
    }
}