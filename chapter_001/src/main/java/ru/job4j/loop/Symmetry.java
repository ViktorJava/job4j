package ru.job4j.loop;

/**
 * Симметричное число.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.11.2020
 */
public class Symmetry {
    /**
     * Метод принимает целочисленное значение.
     * Необходимо проверить является ли оно симметричным или нет.
     * Симметричным считается число в котором числа идущие по порядку
     * в прямом и обратном порядке равны друг другу.
     *
     * @param num Проверяемое число.
     * @return Если число симметричное, true, иначе false.
     */
    public static boolean check(int num) {
        String ch = Integer.toString(num);
        int j = 0;
        for (int i = ch.length() - 1; i >= j; i--, j++) {
            if (ch.charAt(i) != ch.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
