package ru.job4j.condition;

/**
 * @author Created by ViktorJava on 26.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class Max {
    /**
     * ТЗ [#173351]: В Метод max должен возвращать максимальное число из first и second.
     * Для решения этой задачи надо использовать тернарное условие!
     *
     * @param first  первое число
     * @param second второе число
     * @return максимальное из двух чисел.
     */
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
}
