package com.finance.calculator.service;

import com.finance.calculator.model.InvestmentModel;
import com.finance.calculator.model.entity.Employment;
import com.finance.calculator.repository.EmploymentRepo;
import org.springframework.stereotype.Service;

@Service
public class InvestmentService {

    private final EmploymentRepo employmentRepo;

    public InvestmentService(EmploymentRepo employmentRepo) {
        this.employmentRepo = employmentRepo;
    }

    public InvestmentModel investmentModel(String username){
        Employment employment = employmentRepo.findByUsername(username);
        return new InvestmentModel();
    }
}
