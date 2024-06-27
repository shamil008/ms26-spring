package com.example.ms.ingress.spring.controller;


import com.example.ms.ingress.spring.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    private void test(){
        userService.test();
    }
}
