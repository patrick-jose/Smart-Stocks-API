package com.smartstocks.smartstockscoreapi.domains.userterm;

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
@Table(name = "\"UserTerm\"", schema = "\"SmartStocksDB\"")
public class UserTerm {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserTermName name;
}