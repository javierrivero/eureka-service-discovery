package com.javi.get.greetings;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/greetings")
public record GreetingsController(RestTemplate restTemplate) {
    @GetMapping
    public ResponseEntity<String> getGreeting() {
        final String greetings = restTemplate.exchange(
                "http://hellomicroservice/api/v1/hello",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {
                }).getBody();

        return new ResponseEntity<>(greetings, HttpStatus.OK);
    }
}
