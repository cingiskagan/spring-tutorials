package com.tutorial.spring.aio.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Operations {

    @Autowired
    @Qualifier("calculatorBean")
    ICalculator calculator;

    public void calculatorOps(){
        ApplicationContext context
                = new AnnotationConfigApplicationContext(
                CalculatorConfig.class);

        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(2,-30));

        System.out.println(calculator.subs(20,5));
        System.out.println(calculator.subs(20,50));

        System.out.println(calculator.mult(5,4));
        System.out.println(calculator.mult(5,-6));


        try {
            System.out.println(calculator.div(5,4));
            System.out.println(calculator.div(5,0));
        } catch (CalculatorException e) {
            e.printStackTrace();
        }
    }
}
