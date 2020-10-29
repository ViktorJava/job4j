package ru.job4j.loop;

/**
 * Вывести на консоль числа от M до N.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2020
 */
public class BackwardFor {
    /**
     * Метод вывода чисел от M до N. N не включено. M > N.
     *
     * @param m Верхняя граница диапазона чисел.
     * @param n Нижняя граница диапазона чисел.
     */
    public static void out(int m, int n) {
        for (int i = m; i > n; i--) {
            System.out.println(i);
        }
    }
}
