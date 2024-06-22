package com.smartstocks.smartstockscoreapi.domains.userterm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"UserTerm\"", schema = "\"SmartStocksDB\"")
public class UserTerm {
    @Id
    private Long id;

    private String name;
}