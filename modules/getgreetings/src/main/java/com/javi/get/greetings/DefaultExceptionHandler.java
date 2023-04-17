package com.javi.get.greetings;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;

import java.time.LocalDateTime;

@ControllerAdvice
public class DefaultExceptionHandler {
    @ExceptionHandler(RestClientException.class)
    public ResponseEntity<ApiErrorResponse> handleException(RestClientException e, HttpServletRequest request) {
        var response = new ApiErrorResponse(
                request.getRequestURI(),
                e.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR,
                LocalDateTime.now()
        );

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<ApiErrorResponse> handleException(IllegalStateException e, HttpServletRequest request) {
        var response = new ApiErrorResponse(
                request.getRequestURI(),
                e.getMessage(),
                HttpStatus.SERVICE_UNAVAILABLE,
                LocalDateTime.now()
        );

        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }
}
