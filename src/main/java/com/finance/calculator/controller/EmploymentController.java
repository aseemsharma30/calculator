package com.finance.calculator.controller;

import com.finance.calculator.model.entity.Employment;
import com.finance.calculator.service.EmploymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employment")
public class EmploymentController {

    private final EmploymentService employmentService;

    public EmploymentController(EmploymentService employmentService) {
        this.employmentService = employmentService;
    }

    @PostMapping("/current")
    public Employment currentEmployment(@RequestBody Employment employment){
        return employmentService.addCurrentEmployment(employment);
    }
}
