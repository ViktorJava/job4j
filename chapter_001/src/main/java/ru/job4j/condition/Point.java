package ru.job4j.condition;

public class Point {
    public static double distnce(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distnce(0, 5, 0, 0);
        System.out.println("result (0,5) to (0,0) " + result);

        result = distnce(0, 0, 5, 0);
        System.out.println("result (0,0) to (5,0) " + result);

        result = distnce(5, 0, 0, 5);
        System.out.println("result (5,0) to (0,5) " + result);
    }
}
