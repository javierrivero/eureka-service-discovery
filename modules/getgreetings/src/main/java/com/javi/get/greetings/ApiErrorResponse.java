package com.javi.get.greetings;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ApiErrorResponse(
        String path,
        String message,
        HttpStatus status,
        LocalDateTime timestamp
) {
}
