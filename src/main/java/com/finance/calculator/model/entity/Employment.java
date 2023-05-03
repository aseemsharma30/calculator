package com.finance.calculator.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Employment {
    @Id
    @GeneratedValue
    private Long empId;
    private String username;
    jfkdf
//    private UserRegistration registrationId;
    private String companyName;
    private String designation;
    private Integer totalExperience;
    private Long salaryInHand;
}
