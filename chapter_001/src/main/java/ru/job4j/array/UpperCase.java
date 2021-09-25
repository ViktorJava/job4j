package ru.job4j.array;

/**
 * Привести строку к верхнему регистру.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/25/2021
 */
public class UpperCase {
    /**
     * Метод создаёт новую строку, в которой будут все символы исходной
     * в верхнем регистре. Если символ не является буквой,
     * например цифры или символ, то просто записать в результат.
     *
     * @param string Исходная строка.
     * @return Конвертированная строка.
     */
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLetter(string[i])) {
                result[i] = Character.toUpperCase(string[i]);
            } else {
                result[i] = string[i];
            }
        }
        return result;
    }
}
