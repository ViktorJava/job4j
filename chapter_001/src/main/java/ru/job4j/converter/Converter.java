package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result: " + passed);
        in = 9780;
        expected = 163;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("9780 rubles are 163 dollar. Test result: " + passed);
        in = 2;
        expected = 140;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euro are 140 rubles. Tested result: " + passed);
        in = 163;
        expected = 9780;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("163 dollar are 9780 rubles. Tested result: " + passed);
    }
}
