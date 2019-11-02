package ru.job4j.condition;

/**
 * ТЗ [#173351]:нужно сравнить два числа и получить вернуть максимальное из них.
 * Для решения этой задачи надо использовать тернарное условие!
 *
 * @author Created by ViktorJava on 26.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.2
 */
public class Max {
    /**
     * метод возвращает максимальное число из first и second.
     *
     * @param first  первое число
     * @param second второе число
     * @return максимальное из двух чисел.
     */
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    /**
     * Метод возвращает максимальное число из n чисел
     *
     * @param value n колличество операндов
     * @return максимум из n
     */
    public static int max(int... value) {
        int result = 0;
        if ((value != null) && (value.length > 0)) {
            result = value[0];
            for (int i = 1; i < value.length; i++) {
                result = max(value[i], result);
            }
        }
        return result;
    }
}
