package com.smartstocks.smartstockscoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartstocks.smartstockscoreapi.domains.role.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}