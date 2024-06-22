package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.portfolio.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}