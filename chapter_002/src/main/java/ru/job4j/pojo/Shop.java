package ru.job4j.pojo;

/**
 * Удаление моделей из массива. [#176470]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.11.2019
 */
public class Shop {
    /**
     * Метод должен заменить ячейку с индексом index на нулевую ссылку.
     * Потом сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.
     *
     * @param product массив данных типа Product
     * @param index   индекс удаляемого объекта в массиве данных типа Product
     * @return
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

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 12);
        products[1] = new Product("Bread", 6);
        products[2] = new Product("Egg", 29);
        products[3] = new Product("Butter", 2);
        products[4] = null;
        System.out.println("\tFull array:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName() + " \tqt. " + product.getCount());
            } else {
                System.out.println("null");
            }
        }
        //удаление объекта в массиве данных типа Product
        delete(products, 2);
        System.out.println("\n\tDelete index[2]:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName() + " \tqt. " + product.getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}
