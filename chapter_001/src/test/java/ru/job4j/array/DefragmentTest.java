package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 5.10.2019
 */
public class DefragmentTest {

    /**
     * случай index[0] != null
     */
    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     * случай index[0] == null
     */
    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     * случай index[0] && index[1] == null
     */
    @Test
    public void twoNull() {
        String[] input = {null, null, "I", "wanna", null, "be...", null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be...", null, null, null, null};
        assertThat(compressed, is(expected));
    }
}
