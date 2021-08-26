package ru.job4j.max;

/**
 * Зона видимости переменных [#180147].
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/26/2021
 */
public class Reduce {
    private int[] array;

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }

    /**
     * Сетер.
     *
     * @param array Массив данных.
     */
    public void to(int[] array) {
        this.array = array;
    }

    /**
     * Метод выводит на консоль содержимое массива.
     */
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
