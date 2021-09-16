package ru.job4j.lambda.function;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты класса фильтрации списка данных типа Folder,
 * согласно условиям Predicate.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/15/2021
 */
public class SearchFolderTest {
    @Test
    public void whenFilterSize() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(new Folder("fix", 110));
        Predicate<Folder> pred = f -> f.getSize() > 100;
        List<Folder> rsl = SearchFolder.filter(list, pred);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenFilterName() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> expected = List.of(
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        Predicate<Folder> pred = f -> f.getName().contains("bug");
        List<Folder> rsl = SearchFolder.filter(list, pred);
        assertThat(rsl, is(expected));
    }
}
