package ru.job4j.array;

/**
 * Заполнить массив степенями чисел.
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
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i: array) {
            System.out.println(i);
        }
    }
}
