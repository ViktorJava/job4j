package ru.job4j.stream.statistics;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.01.2021
 */
public class AnalyzeTest {
    /**
     * Средний балл, когда один ученик.
     */
    @Test
    public void whenSinglePupil() {
        double average = Analyze.averageScore(List
                .of(new Pupil("Ivanov", List
                        .of(new Subject("Math", 100))))
                .stream());
        assertThat(average, is(100D));
    }

    /**
     * Средний балл, когда два ученика.
     */
    @Test
    public void whenPupilAverage() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(
                                new Subject("Math", 100))),
                        new Pupil("Petrov", List.of(
                                new Subject("Math", 60))))
                        .stream()
        );
        assertThat(average, is(80D));
    }

    /**
     * Средний балл ученика по всем его предметам.
     */
    @Test
    public void whenListOfPupilAverage() {
        List<Tuple> average = Analyze.averageScoreBySubject(
                List.of(
                        new Pupil("Ivanov", List.of(
                                new Subject("Math", 100),
                                new Subject("Lang", 100))),
                        new Pupil("Petrov", List.of(
                                new Subject("Math", 60),
                                new Subject("Lang", 60)))
                ).stream()
        );
        assertThat(average, is(List.of(
                new Tuple("Ivanov", 100D),
                new Tuple("Petrov", 60D)
        )));
    }

    /**
     * Средний бал по всем предметам для каждого ученика.
     */
    @Test
    public void whenListOfSubjectAverage() {
        List<Tuple> average = Analyze.averageScoreByPupil(
                List.of(
                        new Pupil("Ivanov", List.of(
                                new Subject("Math", 100),
                                new Subject("Lang", 70))),
                        new Pupil("Petrov", List.of(
                                new Subject("Math", 60),
                                new Subject("Lang", 80))))
                        .stream());
        assertThat(average, is(List.of(
                new Tuple("Math", 80D),
                new Tuple("Lang", 75D)
        )));
    }

    /**
     * Лучший ученик.
     */
    @Test
    public void whenBestPupil() {
        Tuple best = Analyze.bestStudent(
                List.of(
                        new Pupil("Ivanov", List.of(
                                new Subject("Math", 100),
                                new Subject("Lang", 10))),
                        new Pupil("Petrov", List.of(
                                new Subject("Math", 60),
                                new Subject("Lang", 60))))
                        .stream());
        assertThat(best, is(new Tuple("Petrov", 120D)));
    }

    /**
     * Предмет с наибольшим баллом для всех студентов.
     */
    @Test
    public void whenBestSubject() {
        Tuple best = Analyze.bestSubject(
                List.of(
                        new Pupil("Ivanov", List.of(
                                new Subject("Math", 100),
                                new Subject("Lang", 40))),
                        new Pupil("Petrov", List.of(
                                new Subject("Math", 60),
                                new Subject("Lang", 60))))
                        .stream());
        assertThat(best, is(new Tuple("Math", 160D)));
    }
}
