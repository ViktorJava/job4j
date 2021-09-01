package ru.job4j.pojo;

/**
 * Массив с пустыми ячейками.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/31/2021
 */
public class Shop {
    /**
     * Метод возвращает индекс первой пустой ячейки массива.
     *
     * @param products Массив данных типа Product.
     * @return Индекс первой пустой ячейки массива, -1 при отсутствии таковой.
     */
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
