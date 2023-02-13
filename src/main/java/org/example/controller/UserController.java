package org.example.controller;

import org.example.dto.request.AuthRequestDto;
import org.example.dto.request.UserRequestDto;
import org.example.dto.response.AuthResponseDto;
import org.example.dto.response.UserResponseDto;
import org.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public void registration(@RequestBody UserRequestDto request) {
        userService.create(request);
    }
    @PostMapping("/login")
    public AuthResponseDto login(@RequestBody AuthRequestDto request) {
        return null;
    }
    @PutMapping
    public void update(@RequestBody UserRequestDto request) {
    }
    @DeleteMapping
    public void delete(@RequestParam long userId) {
    }
    @GetMapping
    public UserResponseDto get(@PathVariable long userId) {
        return userService.get(userId);
    }
    @GetMapping("all")
    public List<UserResponseDto> getAll(){
        return userService.getAll();
    }
}
