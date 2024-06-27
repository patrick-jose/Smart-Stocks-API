package com.smartstocks.smartstockscoreapi.domains.portfolio;

import java.math.BigDecimal;

import com.smartstocks.smartstockscoreapi.domains.benchmark.BenchmarkName;
import com.smartstocks.smartstockscoreapi.domains.riskprofile.RiskProfileName;
import com.smartstocks.smartstockscoreapi.domains.user.User;

public record DetailsPortfolioDTO(String name, BigDecimal allocation, String type, RiskProfileName riskProfile, BigDecimal profitabilityDay, BigDecimal profitabilityMonth, BigDecimal profitability12Months, BigDecimal profitabilityTotal, BenchmarkName benchmarkName, BigDecimal profitabilityBenchmark) {
    // public DetailsPortfolioDTO(User user) {
    //     this("teste", allocation, type, user.getRiskProfile(), user.get, profitabilityMonth, profitability12Months, profitabilityTotal, user., profitabilityBenchmark)
    // }
}