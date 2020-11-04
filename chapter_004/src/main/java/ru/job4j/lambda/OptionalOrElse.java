package ru.job4j.lambda;

import java.util.Optional;

/**
 * Optional. Методы orElse(), orElseGet()
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2020
 */
public class OptionalOrElse {

    /**
     * Метод возвращает значение Optionals или -1 если
     * Optionals empty.
     *
     * @param optional Опшинс.
     * @return Значение Optionals или -1 если пусто.
     */
    public static Integer orElse(Optional<Integer> optional) {
        return optional.orElse(-1);
    }
}
