package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.11.2019
 */
public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        Point third = new Point(0, 4);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 6D;
        assertEquals(result, expected, 0.01);
    }
}
