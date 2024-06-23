package com.smartstocks.smartstockscoreapi.domains.role;

import java.util.HashSet;
import java.util.Set;

import com.smartstocks.smartstockscoreapi.domains.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;

@Getter
@Entity
public class Role {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleName name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}