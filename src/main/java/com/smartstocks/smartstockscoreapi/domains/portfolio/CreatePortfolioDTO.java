package com.smartstocks.smartstockscoreapi.domains.portfolio;

import java.math.BigDecimal;

import com.smartstocks.smartstockscoreapi.domains.riskprofile.RiskProfileName;
import com.smartstocks.smartstockscoreapi.domains.user.User;
import com.smartstocks.smartstockscoreapi.domains.userterm.UserTermName;

public record CreatePortfolioDTO(RiskProfileName riskProfile, BigDecimal initialCapital, BigDecimal monthlyAmount, UserTermName userTerm, String objectiveName) {
    public CreatePortfolioDTO(User user) {
        this(user.getRiskProfile().getName(), user.getCapitalAmount(), user.getCapitalAmount(), user.getUserTerm().getName(), "Viagem pra Disney");
    }
}