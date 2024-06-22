package com.smartstocks.smartstockscoreapi.domains.portfoliocomposition;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"PortfolioComposition\"", schema = "\"SmartStocksDB\"")
public class PortfolioComposition {
    @Id
    private Long id;
}