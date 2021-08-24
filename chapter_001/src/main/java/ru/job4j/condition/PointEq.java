package ru.job4j.condition;

/**
 * if c return [#333785]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/24/2021
 */
public class PointEq {
    /**
     * Метод eq проверяет, что две точки в системе координат одинаковы.
     *
     * @param x1 Координата точки.
     * @param y1 Координата точки.
     * @param x2 Координата точки.
     * @param y2 Координата точки.
     * @return true если две точки одинаковы, иначе false.
     */
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return (x1 == x2 && y1 == y2);
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
    }
}
