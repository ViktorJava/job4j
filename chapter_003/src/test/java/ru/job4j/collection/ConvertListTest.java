package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты конвертации листа массивов в один лист Integer.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.05.2020
 */
public class ConvertListTest {
    /**
     * Когда два разных списка массивов целых чисел
     * на входе и один список целых чисел на выходе.
     */
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1});
        in.add(new int[]{2, 3});
        List<Integer> expect = List.of(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }

    /**
     * Когда три разных списка массивов целых чисел
     * на входе и один список целых чисел на выходе.
     */
    @Test
    public void whenThreeList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1});
        in.add(new int[]{2, 3});
        in.add(new int[]{4, 5, 6});
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
