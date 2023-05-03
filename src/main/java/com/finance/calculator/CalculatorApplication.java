package com.finance.calculator;

import com.finance.calculator.model.entity.Employment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CalculatorApplication.class, args);

		list.stream().distinct(Employment::getUsername).collect(Collectors.toList());
		Collections.reverse(list);
	}

}
