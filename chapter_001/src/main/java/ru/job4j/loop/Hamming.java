package ru.job4j.loop;

/**
 * Расстояние Хэмминга.
 * Расстояние Хэмминга - это число позиций в которых
 * соответствующие символы двух слов одинаковой длины различны.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.11.2020
 */
public class Hamming {
    /**
     * Метод принимает две строки одинаковой длинны
     * и определяет число Хэмминга.
     *
     * @param left  Первая строка.
     * @param right Вторая строка.
     * @return число Хэмминга.
     */
    public static int checkStrings(String left, String right) {
        int result = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
