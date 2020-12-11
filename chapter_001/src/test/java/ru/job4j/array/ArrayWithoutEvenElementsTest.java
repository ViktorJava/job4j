package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест метода возвращающего массив нечётных чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.12.2020
 */
public class ArrayWithoutEvenElementsTest {
    @Test
    public void changeData() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = ArrayWithoutEvenElements.changeData(data);
        int[] expect = {1, 3, 5, 7, 9};
        assertThat(result, is(expect));
    }
}
