package com.smartstocks.smartstockscoreapi.domains.benchmark;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"Benchmark\"", schema = "\"SmartStocksDB\"")
public class Benchmark {
    @Id
    private Long id;

    private String name;
}