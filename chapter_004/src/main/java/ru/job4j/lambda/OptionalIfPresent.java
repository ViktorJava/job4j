package ru.job4j.lambda;

import java.util.Optional;

/**
 * Optional. Метод ifPresent()
 * Иногда нужно при нахождении {@link Optional} выполнить какое-то действие.
 * Для этого существует метод ifPresent(), он принимает Consumer,
 * который будет выполнен, если значение {@link Optional} не пустое.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.10.2020
 */
public class OptionalIfPresent {
    /**
     * Если в массиве значение существует, то выводит максимальное значение.
     *
     * @param data Массив данных типа int.
     */
    public static void ifPresent(int[] data) {
        max(data).ifPresent(value -> System.out.println("Max: " + value));
    }

    /**
     * Метод находит максимальный элемент массива. Если массив пуст,
     * то возвращает пустой {@link Optional}, в противном случае {@link Optional}
     * из максимального значения.
     *
     * @param data Массив данных.
     * @return Optional.
     */
    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return Optional.of(max);
    }
}
