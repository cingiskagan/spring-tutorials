package com.tutorial.spring.aio.ioc;

import org.springframework.stereotype.Component;

@Component
public class NormalCalculator implements ICalculator{
    @Override
    public int add(int numA, int numB) {
        return numA + numB;
    }

    @Override
    public int subs(int numA, int numB) {
        return numA - numB;
    }

    @Override
    public int mult(int numA, int numB) {
        return numA * numB;
    }

    @Override
    public int div(int numA, int numB) throws CalculatorException{
        if(numB == 0){
            throw new CalculatorException();
        }
        int result = numA / numB;
        return result;
    }
}
