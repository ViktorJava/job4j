package ru.job4j.collection;

/**
 * Генератор текста.
 * Задан "большой текст". Из него вырезают слова и предложения.
 * Из них составляют "новый текст".
 * Нужно проверить, что "новый текст" был получен из "большого текста".
 * Для этого: "новый текст" делим на слова и отправляем слова в массив.
 * Затем можно пробежаться по массиву слов и сравнить каждое слово
 * с "большим текстом".
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.07.2020
 */
public class Article {
    /**
     * Метод принимает "большой текст" и "новый текст".
     * Проверяется, составлен ли новый текст из большого текста.
     *
     * @param origin Большой текст.
     * @param line   Новый текст.
     * @return true в том случае, когда "новый текст"
     * составлен из "большого текста" иначе false.
     */
    public static boolean generateBy(String origin, String line) {
        String[] words = line.split(" ");
        for (String word : words) {
            if (!origin.contains(word)) {
                return false;
            }
        }
        return true;
    }
}
