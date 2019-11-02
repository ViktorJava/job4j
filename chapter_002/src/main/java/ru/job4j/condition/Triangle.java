package ru.job4j.condition;

/**
 * ТЗ [#173354]:используя формулу Герона необходимо вычистить площадь треугольника
 * с вершинами first, second, third.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.10.2019
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полупериметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с заданными длинами сторон.
     * <ul><li>Напомню, что треугольник может существовать,
     * если сумму двух сторон больше третей для всех комбинаций.</ul>
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
     * <p>
     * Формула.
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * @return площад треугольника
     */
    public double area() {
        double rsl = -1;
        double a = first.distnce(second);
        double b = first.distnce(third);
        double c = second.distnce(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}
