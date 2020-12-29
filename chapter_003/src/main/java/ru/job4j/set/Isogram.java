package ru.job4j.set;

/**
 * Изограмма - это слово, которое не содержит повторяющихся букв,
 * т.е. все буквы в таком слове уникальные.
 * <p>
 * Метод принимает на входе строку, которая является словом,
 * все буквы написаны в нижнем регистре. Входная строка - не фраза,
 * а одно слово, поэтому ее не нужно делить на слова.
 * <p>
 * Метод должен вернуть булево значение - если слово
 * является изограммой - то метод вернет true, иначе - false.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.12.2020
 */
public class Isogram {
    /**
     * Метод возвращает булево значение,если слово является изограммой.
     *
     * @param data Входное слово.
     * @return true если входное слово является изограммой, иначе false.
     */
    public static boolean sheckString(String data) {
        for (int i = 0; i < data.length(); i++) {
            for (int j = i + 1; j < data.length(); j++) {
                if (data.charAt(i) == data.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
