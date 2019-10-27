package ru.job4j.array;

/**
 * ТЗ [#173370]:классический поиск перебором.
 * ТЗ [#173381]:поиск индекса в диапазоне.
 * ТЗ [#173382]:сортировка выборкой.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class FindLoop {
    /**
     * Метод поиска значения в массиве.
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
     * Метод поиска значения в диапазоне массивa.
     *
     * @param data   данные
     * @param el     искомое значение
     * @param start  начало диапазона
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

    /**
     * Сортировка выборкой.
     *
     * @param data массив чисел, который нужно отсортировать по возрастанию.
     * @return возвращает отсортированный по возрастанию массив
     */
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = indexOf(data, i + 1, i, data.length);
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
