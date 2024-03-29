package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Генератор текста.
 * Задан "большой текст". Из него вырезают слова и предложения.
 * Из них составляют "новый текст".
 * Нужно проверить, что "новый текст" был получен из "большого текста".
 * Для этого:
 * 1. Очистили строки от всех символов, которые не попадают под условия
 * регулярного выражения (удалили символы не входящие в диапазоны a-zA-Zа-яА-Я).
 * Привели строки к нижнему регистру, разобрали на слова и сложили в массивы строк.
 * 2. В первом цикле, заполнили карту, словами из строки "большого текста", где
 * ключ карты- это слово из строки, а значение ключа- это частота повторения этого слова.
 * 3. Во втором цикле, слова из "нового текста" сверили с ключами заполненной карты.
 * Если слово "нового текста" присутствует в качестве ключа в карте, значит значение этого
 * ключа уменьшается на единицу иначе в карту записываем новый ключ со значением -1,
 * Далее проверяем значение текущего ключа в карте на -1,
 * досрочно выходим из цикла и возвращаем значение метода false.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2.0
 * @since 20.07.2020
 */
public class Article {
    /**
     * Метод принимает "большой текст" и "новый текст".
     * Проверяется, составлен ли "новый текст" из "большого текста".
     *
     * @param origin Большой текст.
     * @param line   Новый текст.
     * @return true в том случае, когда "новый текст"
     * составлен из "большого текста" иначе false.
     */
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        Map<String, Integer> tempMap = new HashMap<>();
        String[] bigLineArray = origin.replaceAll("[^a-zA-Zа-яА-Я ]", "")
                .toLowerCase()
                .split(" ");
        String[] newLineArray = line.replaceAll("[^a-zA-Zа-яА-Я ]", "")
                .toLowerCase()
                .split(" ");
        for (String key : bigLineArray) {
            if (tempMap.computeIfPresent(key, (k, v) -> v + 1) == null) {
                tempMap.putIfAbsent(key, 1);
            }
        }
        for (String key : newLineArray) {
            if (tempMap.computeIfPresent(key, (k, v) -> v - 1) == null) {
                tempMap.putIfAbsent(key, -1);
            }
            if (tempMap.get(key) < 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
