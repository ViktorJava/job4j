package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.04.2020
 */
public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] result = machine.change(100, 100);
        assertThat(result, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] result = machine.change(50, 35);
        assertThat(result, is(expected));
    }

    @Test
    public void when50by0() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10};
        int[] result = machine.change(50, 0);
        assertThat(result, is(expected));
    }
}
