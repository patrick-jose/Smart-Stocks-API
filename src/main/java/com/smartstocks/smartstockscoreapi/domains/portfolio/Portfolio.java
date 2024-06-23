package com.smartstocks.smartstockscoreapi.domains.portfolio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.smartstocks.smartstockscoreapi.domains.portfoliocomposition.PortfolioComposition;
import com.smartstocks.smartstockscoreapi.domains.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @Column(name = "\"dateCreated\"")
    private LocalDate dateCreated;

    @ManyToOne
    @JoinColumn(name = "\"userId\"")
    private User user;

    @OneToMany(mappedBy = "portfolio")
    private Set<PortfolioComposition> compositions = new HashSet<PortfolioComposition>();
}