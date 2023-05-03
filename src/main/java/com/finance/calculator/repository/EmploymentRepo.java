package com.finance.calculator.repository;

import com.finance.calculator.model.entity.Employment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentRepo extends CrudRepository<Employment, Long> {
    Employment findByUsername(String username);
}
