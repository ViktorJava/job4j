package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.09.2019
 */
public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean rsl = checkPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean rsl = checkPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }
}
