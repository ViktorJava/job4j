package ru.job4j.condition;

import static java.lang.Math.*;

/**
 * Класс точки с координатами x,y в декартовой системе координат
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.10.2019
 */
public class Point {
    private int x;
    private int y;

    /**
     * Конструктор инициализации точки
     *
     * @param first  Х координата точки
     * @param second Y координата точки
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод расстояния между двумя точками
     *
     * @param that вторая (конечная) точка
     * @return расстояние
     */
    public double distnce(Point that) {
        double result = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
        return result;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        double dist = a.distnce(b);
        System.out.println(dist);
    }
}

