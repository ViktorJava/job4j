package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
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
        Turn turned = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turned.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /**
     * тест-метод для проверки программы переворачивания массива с нечётным кол-вом элементов
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //тест с нечётным кол-вом элементов {1,2,3,4,5}
        Turn turned = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = turned.back(input);
        int[] expect = new int[]{5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}
