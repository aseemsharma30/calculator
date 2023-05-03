package com.finance.calculator.controller;

import com.finance.calculator.model.Funds;
import com.finance.calculator.service.FundsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funds")
public class FundsController {

    private final FundsService fundsService;

    public FundsController(FundsService fundsService) {
        this.fundsService = fundsService;
    }

    @PostMapping("/add-initial")
    public Funds addInitialFunds(@RequestBody Funds funds){
        return fundsService.addInitialFunds(funds);
    }

    @PostMapping("/add-emergency-funds")
    public Funds addEmergencyFunds(@RequestParam String username,
                                 @RequestParam double emergencyFund){
        return fundsService.addEmergencyFunds(username, emergencyFund);
    }

    @PostMapping("/remove-emergency-funds")
    public Funds removeEmergencyFunds(@RequestParam String username,
                                 @RequestParam double emergencyFund){
        return fundsService.removeEmergencyFunds(username, emergencyFund);
    }

    @PostMapping("/add-fixed-deposits")
    public Funds addFixedDeposits(@RequestParam String username,
                                   @RequestParam double fixedDeposits){
        return fundsService.addFixedDeposits(username, fixedDeposits);
    }

    @PostMapping("/remove-fixed-deposits")
    public Funds removeFixedDeposits(@RequestParam String username,
                                  @RequestParam double fixedDeposits){
        return fundsService.removeFixedDeposits(username, fixedDeposits);
    }
}
