package ru.job4j.map.farm;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static ru.job4j.map.farm.Farm.Animal;

/**
 * Ферма.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18/11/2021
 */
public class FarmTest {
    @Test
    public void sumLegs() {
        Map<Animal, Integer> data = Map.of(
                new Farm.Animal("chicken", 2), 5,
                new Animal("cow", 4), 2,
                new Animal("pig", 4), 8
        );
        int rsl = Farm.sumLegs(data);
        assertThat(rsl, is(50));
    }
}
