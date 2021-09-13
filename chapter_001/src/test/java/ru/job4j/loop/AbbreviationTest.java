package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/13/2021
 */
public class AbbreviationTest {
    @Test
    public void collect0() {
        String s = "North Atlantic Treaty Organization";
        String result = Abbreviation.collect(s);
        assertThat(result, is("NATO"));
    }

    @Test
    public void collect1() {
        String s = "Chief Executive Officer";
        String result = Abbreviation.collect(s);
        assertThat(result, is("CEO"));
    }

    @Test
    public void collect2() {
        String s = "United Nations Organization";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl, is("UNO"));
    }
}
