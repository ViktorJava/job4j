package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.09.2019
 */
public class DefragmentTest {

    /**
     *
     */
    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     *
     */
    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}