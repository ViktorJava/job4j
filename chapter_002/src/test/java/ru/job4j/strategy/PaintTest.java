package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Тестирование класса Paint.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.12.2019
 */
public class PaintTest {
    private final PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Заменяем стандартный вывод на вывод в пямять для тестирования.
     * Метод setOut управляет выводом.
     */
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    /**
     * Возвращаем обратно стандартный вывод в консоль.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        Paint.draw(new Square());
        assertThat(out.toString(),
                is(new StringJoiner(System.lineSeparator())
                        .add("****")
                        .add("*  *")
                        .add("*  *")
                        .add("****" + System.lineSeparator())
                        .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        Paint.draw(new Triangle());
        assertThat(out.toString(),
                is(new StringJoiner(System.lineSeparator())
                        .add("*")
                        .add("**")
                        .add("* *")
                        .add("****" + System.lineSeparator())
                        .toString()
                )
        );
    }
}
