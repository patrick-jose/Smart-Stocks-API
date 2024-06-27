package com.smartstocks.smartstockscoreapi.configurations.exception;

import lombok.Builder;

@Builder
public record FieldError(
        String field,
        String message) {
}