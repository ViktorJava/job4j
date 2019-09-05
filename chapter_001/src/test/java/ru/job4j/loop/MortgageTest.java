package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
     * тело кредита 1000, ежиемесячный платёж 100 при 1 проценте годовых
     */
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 100, 1);
        assertThat(year, is(1));
    }

    /**
     * Тест двух лет платежей при следующих данных
     * тело кредита 100, ежиемесячный платёж 10 при 50 процентов годовых
     */
    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 10, 50);
        assertThat(year, is(2));
    }
}