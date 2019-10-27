package ru.job4j.array;

/**
 * ТЗ[#173372]:слово начинается с...
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class ArrayChar {
    /**
     * В JDK есть класс String.В нем есть метод startsWith().Этот метод проверяет,что слово начинается c определенной
     * последовательности.
     * <p>
     * <b>Пример:</b> Привет - При - true.
     * <p>
     * Метод startsW аналогичный метод. Проверяет искомую последовательность в исходном слове.
     *
     * @param word исходное слово
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
