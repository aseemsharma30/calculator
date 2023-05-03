package com.finance.calculator.controller;

import com.finance.calculator.model.TransactionModel;
import com.finance.calculator.service.TransactionService;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/add")
    public TransactionModel enterTransaction(@RequestBody TransactionModel transactionModel) throws IOException {
        return transactionService.enterTransaction(transactionModel);
    }
}
