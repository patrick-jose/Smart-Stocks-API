package com.smartstocks.smartstockscoreapi.domains.portfoliohistory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"PortfolioHistory\"", schema = "\"SmartStocksDB\"")
public class PortfolioHistory {
    @Id
    private Long id;
}