package ru.job4j.array;

/**
 * Обход массива с последнего элемента и вывод на консоль,
 * элементов с чётным индексом.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.06.2021
 */
public class PrintEvenElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(
                        "Текущий чётный элемент массива начиная с последнего: "
                                + numbers[numbers.length - 1 - i]);
            }
        }
    }
}
