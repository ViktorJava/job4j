package ru.job4j.ex;

/**
 * Пример метода, для отработки навыков тестирования исключительных ситуаций.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.01.2020
 */
public class Count {
    /**
     * Сумма чисел в заданном диапозоне.
     *
     * @param start  начало диапозона.
     * @param finish конец диапозона.
     * @return сумма чисел.
     */
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less then finish.");
        }
        int rsl = 0;
        for (int index = start; index != finish; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + add(10, 2));
    }
}