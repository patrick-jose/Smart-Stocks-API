package com.smartstocks.smartstockscoreapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.investment.Investment;
import com.smartstocks.smartstockscoreapi.repositories.InvestmentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InvestmentService {
    private final InvestmentRepository investmentRepository;

    public List<Investment> findAll() {
        return this.investmentRepository.findAll();
    }
}