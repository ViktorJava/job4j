package ru.job4j.lambda;

import java.util.Optional;

/**
 * Optional. Методы isPresent(), isEmpty(), get().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.10.2020
 */
public class OptionalGetAndIsPresent {

    /**
     * В методе {@code get()} нужно вызвать метод {@code }indexOf()}.
     * Если вернулся пустой {@link Optional}, то метод должен вернуть -1,
     * в противном случае сам индекс.
     *
     * @param data Массив данных.
     * @param el   Разыскиваемый элемент.
     * @return -1 при неудаче или индекс разыскиваемого элемента.
     */
    public static int get(int[] data, int el) {
        int result = -1;
        if (indexOf(data, el).isPresent()) {
            return indexOf(data, el).get();
        }
        return result;
    }

    /**
     * Метод ищет индекс по значению. Если индекс не найден,
     * должно вернуться {@code Optional.empty()}.
     * Если найден, то {@link Optional} из этого индекса.
     *
     * @param data Массив данных.
     * @param el   Разыскиваемый элемент.
     * @return Пустой Optional или Optional из этого индекса.
     */
    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (el == data[i]) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
