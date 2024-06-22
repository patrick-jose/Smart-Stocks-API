package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.userterm.UserTerm;

public interface UserTermRepository extends JpaRepository<UserTerm, Long> {
}