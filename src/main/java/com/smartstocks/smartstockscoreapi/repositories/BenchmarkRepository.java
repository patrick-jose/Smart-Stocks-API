package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.benchmark.Benchmark;

public interface BenchmarkRepository extends JpaRepository<Benchmark, Long> {
}