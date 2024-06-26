package com.smartstocks.smartstockscoreapi.domains.riskprofile;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"RiskProfile\"", schema = "\"SmartStocksDB\"")
public class RiskProfile {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private RiskProfileName name;
}