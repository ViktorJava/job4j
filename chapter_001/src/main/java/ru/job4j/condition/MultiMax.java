package ru.job4j.condition;

/**
 * ТЗ [#173352]:максимум из трех чисел.
 * Для решения этой задачи надо использовать тернарное условие.
 *
 * @author Created by ViktorJava on 27.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class MultiMax {
    /**
     * Метод должен возвращать максимальное число из трёх чисел first, second, third.
     *
     * @param first  первое число
     * @param second второе число
     * @param third  третье число
     * @return максимальное из трёх чисел.
     */
    public int max(int first, int second, int third) {
        int max = (first > second) ? first : second;
        int result = (max > third) ? max : third;
        return result;
    }
}
