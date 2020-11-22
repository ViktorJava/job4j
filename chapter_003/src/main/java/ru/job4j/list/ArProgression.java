package ru.job4j.list;

import java.util.List;

/**
 * Арифметическая прогрессия.
 * Необходимо реализовать метод, который определит, является ли список чисел
 * арифметической прогрессией. Если является - то метод должен вернуть сумму
 * всех элементов, иначе - вернуть 0.
 * <p>
 * Написал метод читерским способом.
 * Хотел применить итератор, но сходу написать не смог.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.11.2020
 */
public class ArProgression {
    /**
     * Метод определяет, является ли список чисел арифметической прогрессией.
     *
     * @param data Список чисел.
     * @return Если в списке чисел арифметическая прогрессия,
     * возвращаем сумму чисел списка, иначе возвращаем 0.
     */
    public static int checkData(List<Integer> data) {
        for (int i = 0; i < data.size() - 2; i++) {
            if (data.get(i + 1) != (data.get(i) + data.get(i + 2)) / 2) {
                return 0;
            }
        }
        int result = 0;
        for (Integer datum : data) {
            result += datum;
        }
        return result;
    }
}
