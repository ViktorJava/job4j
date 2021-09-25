package ru.job4j.array;

/**
 * indexOf с числом вхождений.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/25/2021
 */
public class IndexOfWithCount {
    /**
     * У String есть метод indexOf(). Он ищет первое вхождение символа.
     * Это метод, который возвращает индекс по количеству вхождений.
     * Если ничего не найдено нужно вернуть -1
     * 1. Для строки "abc", с номером вхождения 1,
     * при поиске символа 'c', должно вернуться 2
     * 2. Для строки "abcdec", с номером вхождения 2,
     * при поиске символа 'c', должно вернуться 5
     * 3. Для строки "abc", с номером вхождения 1,
     * при поиске символа 'z', должно вернуться -1
     *
     * @param string Массив символов.
     * @param c      Искомый символ.
     * @param i      Число вхождений.
     * @return Индекс символа с заданным вхождением.
     */
    public static int indexOf(char[] string, char c, int i) {
        int count = 0;
        for (int j = 0; j < string.length; j++) {
            if (string[j] == c) {
                count++;
                if (count == i) {
                    return j;
                }
            }
        }
        return -1;
    }
}
