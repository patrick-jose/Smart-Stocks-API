package com.smartstocks.smartstockscoreapi.domains.user;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.smartstocks.smartstockscoreapi.domains.riskprofile.RiskProfile;
import com.smartstocks.smartstockscoreapi.domains.role.Role;
import com.smartstocks.smartstockscoreapi.domains.userterm.UserTerm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"User\"", schema = "\"SmartStocksDB\"")
public class User implements UserDetails {
    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

    @Column(name = "\"isEnabled\"")
    private Boolean isEnabled = true;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(schema = "\"SmartStocksDB\"", name = "\"UserRole\"", joinColumns = @JoinColumn(name = "\"userId\""), inverseJoinColumns = @JoinColumn(name = "\"roleId\""))
    private Set<Role> roles = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "\"riskProfileId\"")
    private RiskProfile riskProfile;

    @Column(name = "\"capitalAmount\"")
    private BigDecimal capitalAmount;

    @ManyToOne
    @JoinColumn(name = "\"termId\"")
    private UserTerm userTerm;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}