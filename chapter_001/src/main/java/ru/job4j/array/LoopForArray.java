package ru.job4j.array;

/**
 * Доступ к остальным элементам массива.
 * Метод main должен распечатать все элементы массива за исключением
 * первого элемента и последнего элемента.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.11.2020
 */
public class LoopForArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
