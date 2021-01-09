package ru.job4j.modern;

import java.util.Objects;

/**
 * Модель-класс яблока.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.01.2021
 */
public class Apple {
    private final Color color;
    private final int weight;

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Apple apple = (Apple) o;
        return weight == apple.weight && color.equals(apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return String.format("Apple: {color-'%s', weight- %d}", color, weight);
    }
}
