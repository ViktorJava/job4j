package ru.job4j.stream;

import java.util.List;

/**
 * Понятие редукции. Метод reduce(). Редукция с начальным значением.
 * <p>
 * Умножить 5 на элементы списка.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.12.2020
 */
public class ReductionWithTwoArguments {
    /**
     * Метод умножения элементов списка ня 5.
     *
     * @param data Список данных целочисленного типа.
     * @return Произведение элементов списка целочисленного типа на 5.
     */
    public static Integer collect(List<Integer> data) {
        return data.stream()
                   .reduce(5, (n1, n2) -> n1 * n2);
    }
}
