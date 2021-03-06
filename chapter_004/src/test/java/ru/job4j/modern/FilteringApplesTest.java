package ru.job4j.modern;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тесты фильтрации яблок.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.01.2021
 */
public class FilteringApplesTest {
    /**
     * Тест фильтра зелёных яблок.
     */
    @Test
    public void whenFilteringGreenAples() {
        List<Apple> inventary = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120),
                new Apple(Color.BLUE, 10),
                new Apple(Color.RED, 80)
        );
        List<Apple> expected = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120)
        );
        List<Apple> result = FilteringApples.filteringGreenApples(inventary);
        assertThat(result, is(expected));
    }

    /**
     * Тест фильтра веса яблок.
     */
    @Test
    public void whenFilteringWeightAplle() {
        List<Apple> inventory = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120),
                new Apple(Color.BLUE, 10),
                new Apple(Color.RED, 80));
        List<Apple> expected = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120),
                new Apple(Color.RED, 80)
        );
        List<Apple> result = FilteringApples.filteringWeightApples(inventory);
        assertThat(result, is(expected));
    }

    @Test
    public void whenWeightAppleMore80() {
        List<Apple> in = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120),
                new Apple(Color.BLUE, 10),
                new Apple(Color.RED, 80)
        );
        List<Apple> expected = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120)
        );
        List<Apple> result = FilteringApples.filterApples(in,
                (Apple a) -> a.getWeight() > 80);
        assertThat(result, is(expected));
    }

    @Test
    public void whenColorEqualsBlue() {
        List<Apple> in = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120),
                new Apple(Color.BLUE, 10),
                new Apple(Color.RED, 80)
        );
        List<Apple> expected = Arrays.asList(
                new Apple(Color.BLUE, 10)
        );
        List<Apple> result = FilteringApples.filterApples(in,
                FilteringApples::isBlueApple);
        assertThat(result, is(expected));
    }

    @Test
    public void test() {
        List<Apple> in = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 120),
                new Apple(Color.BLUE, 10),
                new Apple(Color.RED, 80)
        );
        List<Apple> expected = Arrays.asList(
                new Apple(Color.GREEN, 120)
        );
        List<Apple> result = FilteringApples.filterApples(in,
                FilteringApples::isHeavyApple);
        assertThat(result, is(expected));
    }
}
