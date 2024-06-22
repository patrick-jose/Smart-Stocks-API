package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.investmenttype.InvestmentType;

public interface InvestmentTypeRepository extends JpaRepository<InvestmentType, Long> {
}