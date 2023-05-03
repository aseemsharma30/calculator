package com.finance.calculator.service;

import com.finance.calculator.model.SalaryDistribution;
import com.finance.calculator.model.SalaryTypes;
import org.springframework.stereotype.Service;

@Service
public class SalaryDistributionService {

    public SalaryDistribution salaryDistribution(SalaryTypes salaryTypes, Long salary){
        SalaryDistribution salaryDistribution = new SalaryDistribution();
        if(salaryTypes.equals(SalaryTypes.MORE_THAN_50K)){
            salaryDistribution.setMonthlyExpense(((salary * 40)/100));
            salaryDistribution.setInvestments((salary * 30)/100);
            salaryDistribution.setSavings((salary * 20)/100);
            salaryDistribution.setEMIs((salary * 10)/100);
        }
        return salaryDistribution;
    }
}
