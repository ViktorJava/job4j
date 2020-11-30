package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Получение компаратора. Метод reverseOrder().
 * Получить обратный компаратор для строки
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.11.2020
 */
public class ReverseOrder {
    /**
     * Метод получения обратного компаратора для строки.
     *
     * @return Обратный компаратор.
     */
    public static Comparator<String> reverseOrder() {
        Comparator<String> comparator = Comparator.reverseOrder();
        return comparator;
    }
}
