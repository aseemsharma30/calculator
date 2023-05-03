package com.finance.calculator.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserRegistration {
    @Id
    @GeneratedValue
    private Long registrationId;
    private String firstName;
    private String lastName;
    private String userName;
    private String emailAddress;
    private String password;
}
