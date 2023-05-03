package com.finance.calculator.controller;

import com.finance.calculator.model.RegisterUser;
import com.finance.calculator.model.entity.UserRegistration;
import com.finance.calculator.service.RegisterUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterUserController {

    private final RegisterUserService registerUserService;

    public RegisterUserController(RegisterUserService registerUserService) {
        this.registerUserService = registerUserService;
    }

    @PostMapping("/user")
    public UserRegistration registerUser(@RequestBody RegisterUser registerUser){
        return registerUserService.registerUser(registerUser);
    }
}
