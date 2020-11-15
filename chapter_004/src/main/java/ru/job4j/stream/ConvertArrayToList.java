package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * [#173327] Преобразование матрицы чисел в список чисел.
 * Преобразовать числовую матрицу в список:
 * 1. Создать матрицу Integer[][].
 * 2. Написать преобразование этой матрицы в список чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.11.2020
 */
public class ConvertArrayToList {
    /**
     * Метод конвертации матрицы чисел, целочисленного типа,
     * в список данных целочисленного типа.
     *
     * @param value Массив данных.
     * @return Список данных.
     */
    public static List<Integer> converter(Integer[][] value) {
        return Stream.of(value).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
