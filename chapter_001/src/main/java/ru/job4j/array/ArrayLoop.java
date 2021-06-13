package ru.job4j.array;

/**
 * Массив и цикл for-each.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.06.2021
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
