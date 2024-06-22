package com.smartstocks.smartstockscoreapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.investmenthistory.InvestmentHistory;
import com.smartstocks.smartstockscoreapi.repositories.InvestmentHistoryRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InvestmentHistoryService {

    private final InvestmentHistoryRepository investmentHistoryRepository;

    public List<InvestmentHistory> findAll() {
        return this.investmentHistoryRepository.findAll();
    }
}