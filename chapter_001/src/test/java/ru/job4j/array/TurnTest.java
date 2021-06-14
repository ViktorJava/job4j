package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты метода переворачивания массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class TurnTest {

    /**
     * тест-метод для проверки программы переворачивания массива с чётным кол-вом элементов
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        Assert.assertArrayEquals(result, expect);
    }

    /**
     * тест-метод для проверки программы переворачивания массива с нечётным кол-вом элементов
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expect = new int[]{5, 4, 3, 2, 1};
        Assert.assertArrayEquals(result, expect);
    }
}
