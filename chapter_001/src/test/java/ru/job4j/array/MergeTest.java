package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты метода объединения двух отсортированных массивов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.10.2019
 */
//@Ignore
public class MergeTest {
    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(new int[0], new int[0]);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(new int[]{1, 2}, new int[]{3, 4});
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(new int[]{1, 2, 3}, new int[]{3, 4});
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(new int[]{1, 2}, new int[]{3, 4, 4});
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(new int[]{}, new int[]{1, 2, 3, 4});
        assertThat(result, is(expect));
    }
}
