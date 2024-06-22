package com.smartstocks.smartstockscoreapi.domains.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"User\"", schema = "\"SmartStocksDB\"")
public class User {
    @Id
    private Long id;
}