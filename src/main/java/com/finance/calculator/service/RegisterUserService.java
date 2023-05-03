package com.finance.calculator.service;

import com.finance.calculator.model.RegisterUser;
import com.finance.calculator.model.entity.UserRegistration;
import com.finance.calculator.repository.UserRegistrationRepo;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {
    private final UserRegistrationRepo userRegistrationRepo;

    public RegisterUserService(UserRegistrationRepo userRegistrationRepo) {
        this.userRegistrationRepo = userRegistrationRepo;
    }

    public UserRegistration registerUser(RegisterUser registerUser){
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.setEmailAddress(registerUser.getEmailAddress());
        userRegistration.setPassword(registerUser.getPassword());
        userRegistration.setFirstName(registerUser.getFirstName());
        userRegistration.setLastName(registerUser.getLastName());
        userRegistration.setUserName(registerUser.getUserName());
        userRegistrationRepo.save(userRegistration);
        return userRegistration;
    }
}
