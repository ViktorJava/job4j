package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Массив строк с повторяющимися значениями.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.11.2021
 */
public final class NonUniqueString {
    private NonUniqueString() {
    }

    /**
     * Метод принимает массив строк, в котором строки могут повторяться.
     * Необходимо перебрать массив строк и сложить их в карту.
     * При этом должны выполниться следующие условия:
     * 1. Ключом является строка.
     * 2. Значением будет булево переменная.
     * 3. Если строка встречается в массиве 2 и более раз, то булево значение
     * должно быть true. В ином случае - должно принимать значение false.
     *
     * @param strings Массив строк.
     * @return Результирующее отображение.
     */
    public static Map<String, Boolean> checkData(final String[] strings) {
        Map<String, Boolean> rsl = new HashMap<>();
        for (String s: strings) {
            rsl.computeIfPresent(s, (oldV, newV) -> true);
            rsl.putIfAbsent(s, false);
        }
        return rsl;
    }
}
