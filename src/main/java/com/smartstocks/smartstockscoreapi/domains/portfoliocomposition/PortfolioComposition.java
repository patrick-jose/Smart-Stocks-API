package com.smartstocks.smartstockscoreapi.domains.portfoliocomposition;

import java.io.Serializable;
import java.math.BigDecimal;

import com.smartstocks.smartstockscoreapi.domains.investment.Investment;
import com.smartstocks.smartstockscoreapi.domains.portfolio.Portfolio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"PortfolioComposition\"", schema = "\"SmartStocksDB\"")
public class PortfolioComposition {
    @EmbeddedId
    private PortfolioCompositionId id;

    @Column(name = "\"allocationPercentage\"")
    private BigDecimal allocationPercentage;

    @ManyToOne
    @JoinColumn(name = "\"portfolioId\"", insertable = false, updatable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "\"investmentId\"", insertable = false, updatable = false)
    private Investment investment;

    @Embeddable
    public static class PortfolioCompositionId implements Serializable {

        @Column(name = "\"portfolioId\"")
        private Long portfolioId;

        @Column(name = "\"investmentId\"")
        private Long investmentId;

        public PortfolioCompositionId() {
        }

        public PortfolioCompositionId(Long portfolioId, Long investmentId) {
            this.portfolioId = portfolioId;
            this.investmentId = investmentId;
        }
    }
}