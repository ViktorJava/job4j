package ru.job4j;

/**
 * TЗ [#173355]: 4.5. Отладка программы в IDEA
 * Написать тест-методы на проверку данного кода
 * С помощью отладки найти ошибки и устранить их.
 *
 * @author Created by ViktorJava on 27.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class SqMax {
    /**
     * Метод max должен возвращать максимальное число из
     * четырёх чисел first, second, third, forth
     *
     * @param first  первое число
     * @param second второе число
     * @param third  третье число
     * @param forth  четвёртое число
     * @return максимальное из четырёх чисел.
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second && first > third && first > forth) {
            result = first;
        } else if (second > third && second > forth) {
            result = second;
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
