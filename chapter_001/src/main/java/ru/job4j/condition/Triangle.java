package ru.job4j.condition;

/**
 * ТЗ [#173354]: Используя формулу Герона необходимо вычистить площадь треугольника
 *
 * @author Created by ViktorJava on 26.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.2
 */
public class Triangle {

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * <p>
     * Формула.
     * (a + b + c) / 2
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
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * √ p *(p - a) * (p - b) * (p - c)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distnce(x1, y1, x2, y2);
        double b = new Point().distnce(x2, y2, x3, y3);
        double c = new Point().distnce(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (exist(a, b, c))
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }
}
