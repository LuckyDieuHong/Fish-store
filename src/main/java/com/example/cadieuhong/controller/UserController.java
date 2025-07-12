package com.example.cadieuhong.controller;

import com.example.cadieuhong.enity.User;
import com.example.cadieuhong.request.UserCreationRequest;
import com.example.cadieuhong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createRequest(request);
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("{userID}")
    User getUserById(@PathVariable("userID") String userID){
        return userService.getUser(userID);
    }
}
