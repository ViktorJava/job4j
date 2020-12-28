package ru.job4j.lambda;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Тесты компараторов строк через лямбда выражения.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.08.2020
 */
public class FiTest {
    @Test
    // Тест сортировки строк по возрастанию длинны.
    public void whenSortByLenght() {
        Fi fInterface = new Fi();
        Attachment[] attachments = {
                new Attachment("Cats and dogs", 32756),
                new Attachment("People", 865),
                new Attachment("Home and architect", 19768)
        };
        fInterface.cmpSize(attachments);
        assertThat(attachments[0].getName(), is("People"));
    }

    @Test
    // Тест сортировки строк в лексикографическом порядке.
    public void whenLexicographicOrder() {
        Fi fInterface = new Fi();
        Attachment[] attachments = {
                new Attachment("Cats and dogs", 32756),
                new Attachment("People", 865),
                new Attachment("Home and architect", 19768)
        };
        fInterface.cmpText(attachments);
        assertThat(attachments[1].getName(), is("Home and architect"));
    }

    @Test
    // Тест сортировки строк по убыванию длинны.
    public void whenDescendingSort() {
        Fi fInterface = new Fi();
        Attachment[] attachments = {
                new Attachment("Cats and dogs", 32756),
                new Attachment("People", 865),
                new Attachment("Home and architect", 19768)
        };
        fInterface.cmpDescSize(attachments);
        assertThat(attachments[0].getName(), is("Home and architect"));
    }
}
