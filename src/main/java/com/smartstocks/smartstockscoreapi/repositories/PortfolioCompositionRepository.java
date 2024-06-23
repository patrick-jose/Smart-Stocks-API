package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.portfoliocomposition.PortfolioComposition;
import com.smartstocks.smartstockscoreapi.domains.portfoliocomposition.PortfolioComposition.PortfolioCompositionId;

public interface PortfolioCompositionRepository extends JpaRepository<PortfolioComposition, PortfolioCompositionId> {
}