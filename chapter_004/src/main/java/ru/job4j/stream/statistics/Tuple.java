package ru.job4j.stream.statistics;

import java.util.Objects;

/**
 * Класс Tuple содержит результаты: имя и баллы. Этот класс используется
 * как для учеников, так и для предметов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.01.2021
 */
public class Tuple {
    private final String name;
    private final double score;

    public Tuple(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.score, score) == 0
                && Objects.equals(name, tuple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Tuple{"
                + "name='" + name + '\''
                + ", score=" + score + '}';
    }
}
