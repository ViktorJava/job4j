package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double heght) {
        return (heght - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(168);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 168 is " + woman);
    }
}
