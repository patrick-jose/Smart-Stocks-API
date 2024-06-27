package com.smartstocks.smartstockscoreapi.configurations.exception;

import java.time.LocalDateTime;

import lombok.Builder;

@Builder
public record StandardError(
        LocalDateTime timestamp,
        Integer status,
        String error,
        String message,
        String path) {
}