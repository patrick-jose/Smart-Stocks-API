package com.smartstocks.smartstockscoreapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.portfolio.Portfolio;
import com.smartstocks.smartstockscoreapi.repositories.PortfolioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PortfolioService {

    private final PortfolioRepository portfolioRepository;

    public List<Portfolio> findAll() {
        return this.portfolioRepository.findAll();
    }
}