package com.tutorial.spring.aio.ioc;

public interface ICalculator {
    int add(int numA, int numB);
    int subs(int numA, int numB);
    int mult(int numA, int numB);
    int div(int numA, int numB) throws CalculatorException;
}
