package com.finance.calculator.controller;

import com.finance.calculator.model.SalaryDistribution;
import com.finance.calculator.model.SalaryTypes;
import com.finance.calculator.service.SalaryDistributionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salary")
public class SalaryDistributionController {

    private final SalaryDistributionService salaryDistributionService;

    public SalaryDistributionController(SalaryDistributionService salaryDistributionService) {
        this.salaryDistributionService = salaryDistributionService;
    }

    @GetMapping("/distribution")
    public SalaryDistribution salaryDistribution(@RequestParam SalaryTypes salaryTypes,
                                                 @RequestParam Long salary){
        return salaryDistributionService.salaryDistribution(salaryTypes, salary);
    }
}
