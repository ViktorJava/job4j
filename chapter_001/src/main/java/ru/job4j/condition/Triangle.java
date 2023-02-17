package ru.job4j.condition;

/**
 * Площадь треугольника.
 * Используя формулу Герона необходимо вычистить площадь треугольника.
 *
 * @author Created by ViktorJava on 26.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.2
 */
public class Triangle {

    /**
     * Метод вычисления полу-периметра по длинам сторон.
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полу-периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return true or false
     */
    private boolean exist(double a, double b, double c) {
        return (a < b + c && b < a + c && c < a + b);
    }

    /**
     * Метод вычисляет площадь треугольника.
     *
     * @param x1 абсцисса точки один
     * @param y1 ордината точки один
     * @param x2 абсцисса точки два
     * @param y2 ордината точки два
     * @param x3 абсцисса точки три
     * @param y3 ордината точки три
     * @return площадь треугольника
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = Point.distnce(x1, y1, x2, y2);
        double b = Point.distnce(x2, y2, x3, y3);
        double c = Point.distnce(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}
