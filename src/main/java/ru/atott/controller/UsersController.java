package ru.atott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.atott.model.User;
import ru.atott.request.UpdateUserRequest;
import ru.atott.response.UserResponse;
import ru.atott.service.UserService;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserResponse createUser(@RequestBody UpdateUserRequest createUserRequest) {
        User user = userService.createUser(createUserRequest);
        return new UserResponse(user);
    }

    @GetMapping("/user/{id}")
    public UserResponse get(@PathVariable Long id) {
        User user = userService.getUser(id);
        return new UserResponse(user);
    }

    @PostMapping("/user/{id}")
    public UserResponse update(@PathVariable Long id, @RequestBody UpdateUserRequest updateUserRequest) {
        User user = userService.createUser(updateUserRequest);
        return new UserResponse(user);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
