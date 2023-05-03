package com.finance.calculator.service;

import com.finance.calculator.model.Funds;
import com.finance.calculator.repository.FundsRepo;
import org.springframework.stereotype.Service;

@Service
public class FundsService {

    private final FundsRepo fundsRepo;

    public FundsService(FundsRepo fundsRepo) {
        this.fundsRepo = fundsRepo;
    }

    public Funds addInitialFunds(Funds funds){
        fundsRepo.save(funds);
        return funds;
    }

    public Funds addEmergencyFunds(String username, double emergencyFunds){
        Funds funds = fundsRepo.findByUsername(username);
        funds.setEmergencyFunds(funds.getEmergencyFunds() + emergencyFunds);
        fundsRepo.save(funds);
        return funds;
    }

    public Funds removeEmergencyFunds(String username, double emergencyFunds){
        Funds funds = fundsRepo.findByUsername(username);
        funds.setEmergencyFunds(funds.getEmergencyFunds() - emergencyFunds);
        fundsRepo.save(funds);
        return funds;
    }

    public Funds addFixedDeposits(String username, double fixedDeposits){
        Funds funds = fundsRepo.findByUsername(username);
        funds.setFixedDeposits(funds.getFixedDeposits() + fixedDeposits);
        fundsRepo.save(funds);
        return funds;
    }

    public Funds removeFixedDeposits(String username, double fixedDeposits){
        Funds funds = fundsRepo.findByUsername(username);
        funds.setFixedDeposits(funds.getFixedDeposits() - fixedDeposits);
        fundsRepo.save(funds);
        return funds;
    }
}
