package ru.job4j.oop;

/**
 * Статические и не статические методы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.02.2023
 */
public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int y = 10;
        Calculator calculator = new Calculator();

        int sum = sum(y);
        int minus = minus(y);
        int multiply = calculator.multiply(y);
        int divide = calculator.divide(y);
        int sumAllOperation = calculator.sumAllOperation(y);
        String statement = "summ: %d; multiply: %d; minus: %d; divide: %d; sumAll: %d";
        System.out.printf(statement, sum, multiply, minus, divide, sumAllOperation);
    }
}
