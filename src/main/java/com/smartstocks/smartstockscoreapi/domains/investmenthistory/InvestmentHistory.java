package com.smartstocks.smartstockscoreapi.domains.investmenthistory;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.smartstocks.smartstockscoreapi.domains.benchmark.Benchmark;
import com.smartstocks.smartstockscoreapi.domains.investment.Investment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"InvestmentHistory\"", schema = "\"SmartStocksDB\"")
public class InvestmentHistory {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "\"investmentId\"")
    private Investment investmentId;

    @Column(name = "\"performanceDate\"")
    private LocalDate performanceDate;

    @ManyToOne
    @JoinColumn(name = "\"benchmarkId\"")
    private Benchmark benchmark;

    @Column(name = "\"performancePercentageDay\"")
    private BigDecimal performancePercentageDay;

    @Column(name = "\"performancePercentageMonth\"")
    private BigDecimal performancePercentageMonth;

    @Column(name = "\"performancePercentage12Months\"")
    private BigDecimal performancePercentage12Months;

    @Column(name = "\"performancePercentageTotal\"")
    private BigDecimal performancePercentageTotal;

    @Column(name = "\"performancePercentageBenchmark\"")
    private BigDecimal performancePercentageBenchmark;
}