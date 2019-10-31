package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * ТЗ [#173483]:рефакторинг-расстояние между точками.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.10.2019
 */
public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distnce(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distnce(b);
        System.out.println(dist);
    }
}

