package ru.job4j.condition;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/20/2021
 */
public class TrgArea {
    /**
     * Метод рассчитывает площадь треугольника по формуле Герона.
     *
     * @param a Длинна стороны.
     * @param b Длинна стороны.
     * @param c Длинна стороны.
     * @return Площадь треугольника.
     */
    public static double area(double a, double b, double c) {
        double p = a * b * c / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
