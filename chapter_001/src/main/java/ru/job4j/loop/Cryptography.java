package ru.job4j.loop;

/**
 * Шифр строки.
 * Необходимо реализовать метод, принимающий строку,
 * которую необходимо зашифровать таким образом,
 * чтобы на выходе отражались только 4 последних элемента,
 * все остальные были заменены на #. При этом соблюсти условия:
 * 1. Если входная строка пустая - необходимо вернуть строку "empty";
 * 2. Если входная строка содержит больше 0 и не более 4 символов - метод
 * должен вернуть исходную строку.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.11.2020
 */
public class Cryptography {
    /**
     * Метод шифрует строку.
     *
     * @param s Строка для шифровки.
     * @return Зашифрованная строка.
     */
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s.length() == 0) {
            return "empty";
        }
        if (s.length() <= 4) {
            return s;
        }
        for (int i = 0; i < s.length() - 4; i++) {
            sb.setCharAt(i, '#');
        }
        return sb.toString();
    }
}
