package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты метода, который возвращает список студентов, у которых балл аттестата
 * больше заданного.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class StudentLevelTest {
    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(29, "Иванов"));
        input.add(new Student(128, "Петров"));
        List<Student> expected = List.of(
                new Student(128, "Петров"),
                new Student(29, "Иванов")
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(198, "Иванов"));
        input.add(null);
        List<Student> expected = List.of(new Student(198, "Иванов"));
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }
}
