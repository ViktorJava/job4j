package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Получение компаратора. Метод naturalOrder().
 * Получить естественный компаратор для строки.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.11.2020
 */
public class NaturalOrder {
    /**
     * Метод получения естественного компаратора строки.
     *
     * @return Естественный компаратор строки.
     */
    public static Comparator<String> naturalOrder() {
        return Comparator.naturalOrder();
    }
}
