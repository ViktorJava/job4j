package ru.job4j.array;

/**
 * Сумма разниц.
 * Дан массив чисел, нужно найти сумму разниц пар элементов
 * Например:
 * {3, 2, 1} => (3 - 2) + (2 - 1) = 2
 * {15, 10, 5} => (15 - 10) + (10 - 5) => 10
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/6/2021
 */
public class SumOfDifferences {
    /**
     * Метод расчёта суммы разниц пар элементов.
     *
     * @param nums Массив чисел.
     * @return Сумма разниц.
     */
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i] - nums[i + 1];
        }
        return sum;
    }
}
