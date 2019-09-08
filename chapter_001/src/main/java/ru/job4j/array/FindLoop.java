package ru.job4j.array;

/**
 * * ТЗ [#173370]: 6.1. Классический поиск перебором.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class FindLoop {
    /**
     * Метод поиска значения в массиве
     *
     * @param data данные
     * @param el   искомое значение
     * @return возвращает индекс найденного элемента или -1 если ничего не найдено
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод поиска значения в диапазоне массиве
     *
     * @param data данные
     * @param el искомое значение
     * @param start начало диапазона
     * @param finish конец диапазона
     * @return возвращает индекс найденного элемента или -1 если ничего не найдено
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;

        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
