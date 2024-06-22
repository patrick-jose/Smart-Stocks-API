package com.smartstocks.smartstockscoreapi.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.smartstocks.smartstockscoreapi.domains.riskprofile.RiskProfile;
import com.smartstocks.smartstockscoreapi.repositories.RiskProfileRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RiskProfileService {
    private final RiskProfileRepository riskProfileRepository;

    public Page<RiskProfile> findAll(Pageable pageable) {
        return this.riskProfileRepository.findAll(pageable);
    }
}