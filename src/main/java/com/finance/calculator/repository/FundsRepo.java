package com.finance.calculator.repository;

import com.finance.calculator.model.Funds;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundsRepo extends CrudRepository<Funds, Long> {
    Funds findByUsername(String username);
}
