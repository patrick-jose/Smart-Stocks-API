package com.smartstocks.smartstockscoreapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.investmenttype.InvestmentType;
import com.smartstocks.smartstockscoreapi.repositories.InvestmentTypeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InvestmentTypeService {
    private final InvestmentTypeRepository investmentTypeRepository;

    public List<InvestmentType> findAll() {
        return this.investmentTypeRepository.findAll();
    }
}