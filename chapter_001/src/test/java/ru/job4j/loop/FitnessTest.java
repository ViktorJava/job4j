package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.09.2019
 */
public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        Fitness fitness = new Fitness();
        int days = fitness.calc(95, 90);
        assertThat(days, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        Fitness fitness = new Fitness();
        int days = fitness.calc(90, 95);
        assertThat(days, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        Fitness fitness = new Fitness();
        int days = fitness.calc(50, 90);
        assertThat(days, is(2));
    }
}
