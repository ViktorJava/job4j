package ru.job4j.pojo;

/**
 * Удаление моделей из массива. [#310016]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.11.2019
 */
public class ShopDrop {
    /**
     * Метод должен заменить ячейку с индексом index на нулевую ссылку.
     * Потом сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.
     *
     * @param product массив данных типа Product
     * @param index   индекс удаляемого объекта в массиве данных типа Product
     * @return Массив типа Product c удалённым элементом.
     */
    public static Product[] delete(Product[] product, int index) {
        product[index] = null;
        for (int i = index + 1; i < product.length; i++) {
            if (product[i] != null) {
                product[i - 1] = product[i];
                product[i] = null;
            } else {
                product[i - 1] = null;
            }
        }
        return product;
    }
}
