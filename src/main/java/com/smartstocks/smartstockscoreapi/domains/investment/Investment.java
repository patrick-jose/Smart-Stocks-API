package com.smartstocks.smartstockscoreapi.domains.investment;

import java.math.BigDecimal;

import com.smartstocks.smartstockscoreapi.domains.investmenttype.InvestmentType;
import com.smartstocks.smartstockscoreapi.domains.riskprofile.RiskProfile;

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
@Table(name = "\"Investment\"", schema = "\"SmartStocksDB\"")
public class Investment {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "\"typeId\"")
    private InvestmentType investmentType;

    @ManyToOne
    @JoinColumn(name = "\"riskProfileId\"")
    private RiskProfile riskProfile;

    @Column(name = "\"minimumInvestment\"")
    private BigDecimal minimumInvestment;
}