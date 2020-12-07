package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения Фамилия И.О. из Фамилия Имя Отчество.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.12.2020
 */
public class InitialsTest {
    @Test
    public void test() {
        assertEquals("Vdovichenko V.A.", Initials.convert(
                new String[]{"Vdovichenko", "Viktor", "Alexandrovich"}));
        assertEquals("Иванов И.И.", Initials.convert(
                new String[]{"Иванов", "иван", "Иваныч"}));
    }
}
