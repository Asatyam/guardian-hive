package com.security.aiobservability.userservice.rest;

import com.security.aiobservability.userservice.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class DummyUserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return new User(id);
    }
}
