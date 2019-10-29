package ru.job4j.calculator;

/**
 * Калькулятор выполняет простые арифметические действия над числами с плавающей запятой
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.09.2019
 */
public class Calculator {
    /**
     * Сложение двух числе и вывод суммы на консоль
     *
     * @param first  первое слагаемое
     * @param second второе слагаемое
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Деление двух числе и вывод частного на консоль
     *
     * @param first  делимое
     * @param second делитель
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Умножение двух числе и вывод произведения на консоль
     *
     * @param first  первый множитель
     * @param second второй множитель
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Вычитание двух числе и вывод разности на консоль
     *
     * @param first  уменьшаемое
     * @param second вычитаемое
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Точка входа в класс
     * @param args аргументы передаваемые в класс
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
