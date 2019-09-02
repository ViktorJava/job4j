package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс Unit (JUnit framework) тестов в связке с библиотекой hamcrest
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.09.2019
 */
public class FitnessTest {

    //Тест когда тяга Ивана больше тяги Ника на 5 кило
    @Test
    public void whenIvanGreatNik() {
        Fitness fitness = new Fitness();
        int days = fitness.calc(95, 90);
        assertThat(days, is(0));
    }

    //Тест когда тяга Ивана менее тяги Ника на 5 кило
    @Test
    public void whenIvanLessByOneNik() {
        Fitness fitness = new Fitness();
        int days = fitness.calc(90, 95);
        assertThat(days, is(1));
    }

    //Тест когда тяга Ивана значительно слабее тяги Ника на 40 кило
    @Test
    public void whenIvanLessByFewNik() {
        Fitness fitness = new Fitness();
        int days = fitness.calc(50, 90);
        assertThat(days, is(2));
    }
}