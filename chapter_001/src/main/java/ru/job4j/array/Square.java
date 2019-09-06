package ru.job4j.array;

/**
 * ТЗ [#173369]: 6.0. Заполнить массив степенями чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class Square {

    /**
     * Метод возведения в квадрат
     *
     * @param bound размер массива
     * @return результат
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}
