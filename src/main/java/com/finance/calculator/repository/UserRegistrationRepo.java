package com.finance.calculator.repository;

import com.finance.calculator.model.entity.UserRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepo extends CrudRepository<UserRegistration, Long> {
    UserRegistration findByUserName(String userName);
}
