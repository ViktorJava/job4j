package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;

/**
 * Тесты самодельного компаратора двух строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.05.2020
 */
public class StringCompareTest {
    //две строки одинаковы.
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    // Left больше right (лексикографически).
    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    // Left больше right (лексикографически)
    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    // Left меньше right (по длине)
    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    // Тест алгоритма на пустые строки.
    @Test
    public void whenStringEmpty() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "",
                ""
        );
        assertThat(rst, is(0));
    }

    // Тест алгоритма на пустую строку.
    @Test
    public void whenEmptyStringLessThanComplete() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                ""
        );
        assertThat(rst, greaterThan(0));
    }
}
