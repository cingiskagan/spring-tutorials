package com.tutorial.spring.aio.ioc;

import org.springframework.stereotype.Component;

@Component
public class OptimisticCalculator implements ICalculator{
    @Override
    public int add(int numA, int numB) {
        return Math.abs(numA + numB);
    }

    @Override
    public int subs(int numA, int numB) {
        return Math.abs(numA - numB);
    }

    @Override
    public int mult(int numA, int numB) {
        return Math.abs(numA * numB);
    }

    @Override
    public int div(int numA, int numB) {
        if(numB == 0){
            return 0;
        }
        int result = numA / numB;
        return result;
    }
}
