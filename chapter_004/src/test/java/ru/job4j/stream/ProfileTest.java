package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тестирование списка адресов клиента.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 16.10.2020
 */
public class ProfileTest {

    @Test
    public void test() {
        List<Profile> resProfiles = Arrays.asList(
                new Profile(new Adress("Norfolk", "Norchester ave", 28, 6)),
                new Profile(new Adress("Bryansk", "Razina", 26, 17)),
                new Profile(new Adress("Moscow", "Tverskaya", 15, 5))
        );
        List<Adress> expected = Arrays.asList(
                new Adress("Norfolk", "Norchester ave", 28, 6),
                new Adress("Bryansk", "Razina", 26, 17),
                new Adress("Moscow", "Tverskaya", 15, 5)
        );
        assertThat(Profiles.collect(resProfiles), is(expected));
    }

    public void whenDublicates() {
        List<Profile> resProfiles = Arrays.asList(
                new Profile(new Adress("Norfolk", "Norchester ave", 28, 6)),
                new Profile(new Adress("Bryansk", "Razina", 26, 17)),
                new Profile(new Adress("Moscow", "Tverskaya", 15, 5)),
                new Profile(new Adress("Moscow", "Tverskaya", 15, 5)),
                new Profile(new Adress("Bryansk", "Razina", 26, 17))
        );
        List<Adress> expected = Arrays.asList(
                new Adress("Norfolk", "Norchester ave", 28, 6),
                new Adress("Bryansk", "Razina", 26, 17),
                new Adress("Moscow", "Tverskaya", 15, 5)
        );
        assertThat(Profiles.uniquAdressList(resProfiles), is(expected));
    }
}
