package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.07.2020
 */
public class FreezeStrTest {
    @Test
    public void whenEq() {
        assertThat(FreezeStr.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNoEq() {
        assertThat(FreezeStr.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr.eq("hello", "helloo"), is(false));
    }
}