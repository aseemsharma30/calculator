package com.finance.calculator.service;

import com.finance.calculator.model.entity.Employment;
import com.finance.calculator.repository.EmploymentRepo;
import org.springframework.stereotype.Service;

@Service
public class EmploymentService {
    private final EmploymentRepo employmentRepo;

    public EmploymentService(EmploymentRepo employmentRepo) {
        this.employmentRepo = employmentRepo;
    }

    public Employment addCurrentEmployment(Employment employment){
        employmentRepo.save(employment);
        return employment;
    }


}
