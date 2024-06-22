package com.smartstocks.smartstockscoreapi.domains.investmenttype;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"InvestmentType\"", schema = "\"SmartStocksDB\"")
public class InvestmentType {
    @Id
    private Long id;

    private String name;
}