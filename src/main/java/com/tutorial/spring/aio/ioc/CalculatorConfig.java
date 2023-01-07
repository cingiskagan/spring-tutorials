package com.tutorial.spring.aio.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Optional;

@Configuration
public class CalculatorConfig {

    @Autowired
    Environment environment;

    @Bean
    public ICalculator calculatorBean(){
        String sProp = Optional.ofNullable(environment.getProperty("calculator.type"))
                .orElse("-1");
        int property = Integer.parseInt(sProp);
        return switch (property) {
            case 0 -> new OptimisticCalculator();
            case 1 -> new NormalCalculator();
            default -> null;
        };
    }
}
