package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.portfoliocomposition.PortfolioComposition;

public interface PortfolioCompositionRepository extends JpaRepository<PortfolioComposition, Long> {
}