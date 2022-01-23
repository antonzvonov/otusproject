package ru.atott.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.atott.response.HealthResponse;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    private HealthResponse health() {
        return HealthResponse.OK;
    }
}
