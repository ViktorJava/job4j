package ru.job4j.collection;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Тесты {@code ConvertList2Array.toArray()}.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.05.2020
 */
public class ConvertList2ArrayTest {
    /**
     * Условия: семь элементов по три в строке.
     * Выход: массив 3 на 3 добитый нулями.
     */
    @Test
    public void when7ElementsThen9() {
        int[][] result = ConvertList2Array.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    /**
     * Условия: десять элементов по четыре в строке.
     * Выход: массив 4 на 3 добитый нулями.
     */
    @Test
    public void when10ElementsThen12() {
        int[][] result = ConvertList2Array.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                4
        );
        int[][] expect = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
