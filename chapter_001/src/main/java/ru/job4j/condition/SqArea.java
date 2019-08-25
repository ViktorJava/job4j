package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = square(6, 2);
        System.out.println("p=6, k=2, s=2, real= " + result);
    }
}
