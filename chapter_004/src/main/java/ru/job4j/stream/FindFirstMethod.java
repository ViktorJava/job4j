package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

/**
 * Терминальные операции. Метод findFirst().
 * <p>
 * Получить первый элемент стрима списка.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.12.2020
 */
public class FindFirstMethod {
    /**
     * Метод получения первого элемента списка.
     *
     * @param data Integer список данных целочисленного типа.
     * @return Integer первый элемент списка данных, или empty в случае
     * отсутствия элементов в списке.
     */
    public static Optional<Integer> first(List<Integer> data) {
        return data.stream()
                   .findFirst();
    }
}
