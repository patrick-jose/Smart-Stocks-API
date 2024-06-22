package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.investment.Investment;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}