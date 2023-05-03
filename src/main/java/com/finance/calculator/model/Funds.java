package com.finance.calculator.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Funds {
    @Id
    @GeneratedValue
    private Long fundId;
    private String username;

    private double emergencyFunds;
    private double fixedDeposits;
    private double lifeInsurance;
    private double publicProvidentFund;
    private double providentFund;
    private double gold;
    private double sip;
    private double buyingPower;
    private double travelAllowance;
    private double unexpectedFunds;

    private LocalDate date = LocalDate.now();

}
