package ru.job4j.ex;

/**
 * Кидаем исключение - throw new RuntimeException [#219365 #199353].
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.3
 * @since 07.01.2020
 */
public class Fact {
    /**
     * Вычисление факториала.
     *
     * @param n значение для которого вычисляется факториал.
     * @return факториал числа.
     */
    public static int cal(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument error (argument < 0)");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
