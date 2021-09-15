package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Бонусные чашки кофе.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/13/2021
 */
public class BonusCupCoffeeTest {
    @Test
    public void countCup() {
        int rsl = BonusCupCoffee.countCup(7, 6);
        assertThat(rsl, is(8));
    }

    @Test
    public void countCup1() {
        int rsl = BonusCupCoffee.countCup(213, 6);
        assertThat(rsl, is(248));
    }
}
