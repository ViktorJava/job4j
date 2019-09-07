package ru.job4j.array;

/**
 * ТЗ [#173372]: 6.4. Слово начинается с ...
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class ArrayChar {

    /**
     * Метод проверяет, что слово начинается c определенной последовательности.
     *
     * @param word слово
     * @param pref искомая последовательность
     * @return true/false
     */
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
