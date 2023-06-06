package org.example.controller;

import org.example.model.User;
import lombok.RequiredArgsConstructor;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public User add(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/user/{email}")
    public User findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable long id){
        userService.deleteById(id);
    }
}