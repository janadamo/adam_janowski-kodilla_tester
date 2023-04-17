package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult,0.01);
    }
    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        double a = 3.2;
        double b = 7.2;
        double substractReslut = calculator.substract(a, b);
        assertEquals(-4, substractReslut, 0.01);
    }
    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 2.9;
        double squareResult = calculator.square(a);
        assertEquals(8.41, squareResult,0.01);
    }
}
