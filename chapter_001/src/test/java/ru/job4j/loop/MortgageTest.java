package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Класс Unit (JUnit framework) тестов с библиотекой hamcrest
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.09.2019
 */
public class MortgageTest {

    /**
     * Тест одного года платежей при следующих данных
     * тело кредита 1000, ежемесячный платёж 100 при 1 проценте годовых
     */
    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 100, 1);
        assertThat(year, is(1));
    }

    /**
     * Тест двух лет платежей при следующих данных
     * тело кредита 100, ежемесячный платёж 10 при 50 процентов годовых
     */
    @Test
    public void when2Year() {
        int year = Mortgage.year(100, 10, 50);
        assertThat(year, is(2));
    }
}