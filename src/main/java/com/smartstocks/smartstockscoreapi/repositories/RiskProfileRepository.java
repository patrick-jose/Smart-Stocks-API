package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.riskprofile.RiskProfile;

public interface RiskProfileRepository extends JpaRepository<RiskProfile, Long> {
}