package com.yermanov.apigateway.controlller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback/orders")
    public ResponseEntity   <String> orderFallback() {
        return ResponseEntity.ok("Order Service is currently unavailable. Please try again later.");
    }

    @GetMapping("/fallback/users")
    public ResponseEntity<String> userFallback() {
        return ResponseEntity.ok("User Service is currently unavailable. Please try again later.");
    }
}
