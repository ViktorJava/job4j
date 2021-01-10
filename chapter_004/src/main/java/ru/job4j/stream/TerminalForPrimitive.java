package ru.job4j.stream;

import java.util.Arrays;

/**
 * 4.5. Терминальные операции. Операции стримов из примитивов.
 * <p>
 * Отработка знаний по работе с потоками данных примитивного типа.
 * Написать методы: min(), max(), sum(), average(), count().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.01.2021
 */
public class TerminalForPrimitive {
    private final int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    /**
     * Метод считает количество элементов в потоке примитивов целочисленного типа.
     *
     * @return Количество элементов в потоке примитивов.
     */
    public long count() {
        return Arrays.stream(data)
                     .count();
    }

    /**
     * Метод возвращает максимальный элемент в потоке примитивов
     * целочисленного типа.
     *
     * @return Максимальный элемент.
     */
    public long max() {
        return Arrays.stream(data)
                     .max()
                     .getAsInt();
    }

    /**
     * Метод возвращает минимальный элемент в потоке примитивов
     * целочисленного типа.
     *
     * @return Минимальный элемент.
     */
    public long min() {
        return Arrays.stream(data)
                     .min()
                     .getAsInt();
    }

    /**
     * Метод возвращает сумму элементов в потоке примитивов
     * целочисленного типа.
     *
     * @return Сумма элементов.
     */
    public long sum() {
        return Arrays.stream(data)
                     .sum();
    }

    /**
     * Метод возвращает среднее арифметическое, элементов в потоке примитивов
     * целочисленного типа.
     *
     * @return Среднее арифметическое всех элементов.
     */
    public double avg() {
        return Arrays.stream(data)
                     .average()
                     .getAsDouble();
    }
}
