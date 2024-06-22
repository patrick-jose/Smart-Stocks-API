package com.smartstocks.smartstockscoreapi.domains.portfolio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"Portfolio\"", schema = "\"SmartStocksDB\"")
public class Portfolio {
    @Id
    private Long id;
}