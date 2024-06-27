package com.smartstocks.smartstockscoreapi.configurations.exception;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;

@Builder
public record ValidationError(
        LocalDateTime timestamp,
        Integer status,
        String error,
        String message,
        List<FieldError> errors,
        String path) {
}