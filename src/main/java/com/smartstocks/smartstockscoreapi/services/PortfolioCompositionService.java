package com.smartstocks.smartstockscoreapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.portfoliocomposition.PortfolioComposition;
import com.smartstocks.smartstockscoreapi.repositories.PortfolioCompositionRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PortfolioCompositionService {
    private final PortfolioCompositionRepository portfolioCompositionRepository;

    public List<PortfolioComposition> findAll() {
        return this.portfolioCompositionRepository.findAll();
    }
}