package com.smartstocks.smartstockscoreapi.configurations.security;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Login(
        @NotNull String email,
        @NotBlank String password) {
}