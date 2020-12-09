package ru.job4j.array;

/**
 * Проверка массива на уникальность элементов.
 * <p>
 * Метод принимает массив целочисленных значений, а также число value,
 * которое мы будем искать в этом массиве. Метод должен посчитать количество
 * одинаковых элементов которые совпадают с value, и если окажется, что это
 * число больше или равно половине длины входного массива - массив считается
 * невалидным и метод должен вернуть false.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.12.2020
 */
public class Validator {
    /**
     * Метод проверки массива на уникальность элементов.
     *
     * @param data  Массив целочисленных чисел.
     * @param value Уникальный элемент.
     * @return true если массив валидный, иначе false.
     */
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int i : data) {
            if (i == value) {
                count++;
            }
        }
        return count < data.length / 2;
    }
}
