package com.smartstocks.smartstockscoreapi.domains.portfolio;

import java.math.BigDecimal;

import com.smartstocks.smartstockscoreapi.domains.riskprofile.RiskProfileName;
import com.smartstocks.smartstockscoreapi.domains.userterm.UserTermName;

public record CreatePortfolioDTO(RiskProfileName riskProfile, BigDecimal initialCapital, BigDecimal monthlyAmount, UserTermName userTerm, String objectiveName) {
    public CreatePortfolioDTO(Portfolio portfolio) {
        this(portfolio.getUser().getRiskProfile().getName(), portfolio.getUser().getCapitalAmount(), portfolio.getUser().getCapitalAmount(), portfolio.getUser().getUserTerm().getName(), "Viagem pra Disney");
    }
}