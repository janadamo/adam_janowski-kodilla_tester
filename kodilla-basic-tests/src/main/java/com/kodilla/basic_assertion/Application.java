package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int a = 5;
            int b = 8;
            int sumResult = calculator.sum(a, b);
            boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        double substractResult = calculator.substract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3, substractResult);
        if (correct1) {
            System.out.println("Metoda substract działą poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działą poprawnie dla " + a + " i " + b);
        }
        double squareResult = calculator.square(a);
        boolean correct2 = ResultChecker.assertEquals(25,squareResult);
        if (correct2) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        }else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}
