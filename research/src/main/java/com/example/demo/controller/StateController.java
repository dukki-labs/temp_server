package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.entity.UserTest;
import com.example.demo.service.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StateController {

    private final StateService stateService;

    @GetMapping("/")
    public String index() {
        return "Hello This is my first app test june";
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void userCreate(@RequestBody User user) {
        stateService.createUser(user);
    }

    @GetMapping("/users")
    public List<UserTest> userState() {
        return stateService.getUserStateList();
    }
}
