package com.finance.calculator.controller;

import com.finance.calculator.model.entity.Employment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    private final RestTemplate restTemplate;

    public EmployeeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/employee")
    public String response(@RequestBody Employment employment){
        String a = restTemplate.postForObject(url, employment, String.class);
        String b = restTemplate.postForObject(url, employment, String.class);
        String c = restTemplate.postForObject(url, employment, String.class);

        acounts
                profile
                statements
                        transactions
    }

    @PutMapping("/update-name/{id}")
    public Account updateAccount(@PathVariable String id,
                                 @RequestParam String name,
                                 @RequestParam LocalDate date){
        return service.
    }


}
