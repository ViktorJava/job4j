package ru.job4j.condition;

/**
 * ТЗ [#173352]: 4.4. Максимум из трех чисел
 *
 * @author Created by ViktorJava on 27.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class MultiMax {
    /**
     * Метод max должен возвращать максимальное число из
     * трёх чисел first, second, third.
     * Для решения этой задачи надо использовать тернарное условие!
     *
     * @param first  первое число
     * @param second второе число
     * @param third третье число
     * @return максимальное из трёх чисел.
     */
    public int max(int first, int second, int third) {
        int maxFirstOrSecond = (first > second) ? first : second;
        int result = (maxFirstOrSecond > third) ? maxFirstOrSecond : third;
        return result;
    }
}
