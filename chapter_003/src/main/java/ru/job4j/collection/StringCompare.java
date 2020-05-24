package ru.job4j.collection;

import java.util.Comparator;

/**
 * Поэлементное сравнение двух списков, т.е. сравниваем
 * элементы двух списков, находящихся на одних и тех же позициях
 * (под одним и тем же индексом).
 * Сравнение в лексикографическом порядке.
 * <p>
 * 1. Крутимся в цикле по меньшему слову и считаем переменную result.
 * Если result=0 значит символы в left и right равны и продолжаем крутиться в цикле.
 * Если итерации закончились, значит по меньшему слову, left и right лексикографически равны.
 * Проверяем условия за циклом. Условие за циклом сработает только при полном проходе цикла,
 * например: Петров - Петрова и подобных случаях.
 * 2. Условие в цикле срабатывает только при разности сиволов в left и right.
 * Дальше проверять нечего, результат известный, выходим из цикла.
 * Иначе символы равны и крутимся в цикле до окончания цикла или срабатывания условия.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.05.2020
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int size = Math.min(left.length(), right.length());
        for (int index = 0; index < size; index++) {
            result = Character.compare(left.charAt(index), right.charAt(index));
            if (result != 0) {
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
