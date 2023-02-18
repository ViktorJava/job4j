package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.02.2023
 */
class DslTest {
    /**
     * Проверка целочисленных значений.
     */
    @Test
    public void whenEquals() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверка чисел с плавающей точкой.
     */
    @Test
    public void whenFloatPoint() {
        float result = 1.0000001F;
        float expected = 1F;
        assertThat(result).isCloseTo(expected, offset(0.01F));
    }

    /**
     * Равенство массивов.
     */
    @Test
    public void whenArray() {
        int[] result = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }
}
