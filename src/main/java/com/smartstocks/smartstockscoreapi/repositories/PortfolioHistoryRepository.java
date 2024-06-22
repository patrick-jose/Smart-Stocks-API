package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.portfoliohistory.PortfolioHistory;

public interface PortfolioHistoryRepository extends JpaRepository<PortfolioHistory, Long> {
}