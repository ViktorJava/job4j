package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс Unit (JUnit framework) тестов в связке с библиотекой hamcrest
 *
 * @author Created by ViktorJava on 01.09.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class BoardTest {

    //    тест форматирования доски размером 3 на 3
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        assertThat(result, is(expected));
    }

    //    тест форматирования доски размером 5 на 4
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWidthFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
        assertThat(result, is(expected));


    }
}