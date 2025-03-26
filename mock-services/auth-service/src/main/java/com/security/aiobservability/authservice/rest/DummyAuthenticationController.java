package com.security.aiobservability.authservice.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class DummyAuthenticationController {
    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {

        String username = "admin";
        String password = "admin";
        if (authRequest.getUsername().equals(username) && authRequest.getPassword().equals(password)) {
            return new AuthResponse("abcde1234");
        }
        throw new RuntimeException("Invalid username or password");

    }
}
