package com.finance.calculator.model;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class TransactionModel {
    private String userName;
    private Date transactionDate;
    private Long transactionAmount;
    private CategoryType categoryType;
    private String product;
    private Date entryTime = new Date();
}
