package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

/**
 * Тесты компараторов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.05.2020
 */
public class JobTest {
    // name по убыванию затем сравнивая priority по убыванию.
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    // priority по возрастанию затем сравнивая name по убыванию.
    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobAscByPriority()
                .thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    // name по возрастанию.
    @Test
    public void whenCompatorAscendingByName() {
        Comparator<Job> cmpAscendingByName = new JobAscByName();
        int rsl = cmpAscendingByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    // name по убыванию.
    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> cmpDescByName = new JobDescByName();
        int rsl = cmpDescByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    // priority по возрастанию.
    @Test
    public void whenCompatorAscendingByPriority() {
        Comparator<Job> cmpAscendingByPriority = new JobAscByPriority();
        int rsl = cmpAscendingByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    // priority по убыванию
    @Test
    public void whenCompatorDescByPrioruty() {
        Comparator<Job> cmpDescByPriority = new JobDescByPriority();
        int rsl = cmpDescByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
