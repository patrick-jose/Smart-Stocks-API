package com.smartstocks.smartstockscoreapi.services;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.portfolio.Portfolio;
import com.smartstocks.smartstockscoreapi.repositories.PortfolioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PortfolioService {

    private final PortfolioRepository portfolioRepository;

    public Portfolio createPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public Portfolio getPortfolioById(Long id) {
        return portfolioRepository.getReferenceById(id);
    }
}