package com.finance.calculator.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.finance.calculator.model.TransactionModel;
import com.finance.calculator.model.entity.UserRegistration;
import com.finance.calculator.repository.UserRegistrationRepo;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

@Service
public class TransactionService {

    private final UserRegistrationRepo userRegistrationRepo;

    public TransactionService(UserRegistrationRepo userRegistrationRepo) {
        this.userRegistrationRepo = userRegistrationRepo;
    }

    public TransactionModel enterTransaction(TransactionModel transactionModel) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        FileWriter file = new FileWriter("C:\\workspace\\calculator - Copy\\src\\main\\resources\\transactions\\"
                + transactionModel.getUserName() +
                "-" + transactionModel.getTransactionDate().getYear() +
                "-" + transactionModel.getTransactionDate().getMonth() +
                "-" + transactionModel.getTransactionDate().getDate() +
                ".json");
        file.write(mapper.writeValueAsString(transactionModel));
        file.close();
        return transactionModel;
    }
}
