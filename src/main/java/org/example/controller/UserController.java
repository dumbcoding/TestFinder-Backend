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

    /*@GetMapping("/user")
    public List<User> getAll() {
        return userService.getAll();
    }*/

    @GetMapping(value = "/user", params = {"email"})
    public User findByEmail(@RequestParam(value="email") String email) {
        return userService.findByEmail(email);
    }
    @GetMapping(value = "/user", params = {"id"})
    public String findById(@RequestParam(value="id") long id) {
        return userService.findById(id);
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