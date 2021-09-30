package ru.job4j.collection;

import java.util.HashSet;

/**
 * Идентичные тексты [#212655].
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/30/2021
 */
public class UniqueText {
    /**
     * Метод, который сравнивает два текста. Если они состоят из один и тех же
     * слов, то мы считаем, что текст не уникальный.
     *
     * @param originText    Оригинальный текст.
     * @param duplicateText Проверяемый текст.
     * @return true если тексты не уникальны, иначе false.
     */
    @SuppressWarnings({"ManualArrayToCollectionCopy", "UseBulkOperation"})
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String s: origin) {
            check.add(s);
        }
        for (String s: text) {
            if (!check.contains(s)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
