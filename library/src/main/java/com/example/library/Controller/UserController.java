package com.example.library.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.Model.User;
import com.example.library.Service.UserService;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody User user){
        Integer userId = userService.createUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body("帳戶已建立"+userId);
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user){
        Boolean loginStatus = userService.loginUser(user);
        if (loginStatus) {
            return ResponseEntity.status(HttpStatus.CREATED).body("success");
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body("fail");
        }
    }
}
