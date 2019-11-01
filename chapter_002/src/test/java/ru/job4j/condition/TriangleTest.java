package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.11.2019
 */
public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // координаты вершин треугольника
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        Point third = new Point(0, 4);
        //создаём объект треугольник
        Triangle triangle = new Triangle(first, second, third);
        //вычисляем площадь
        double result = triangle.area();
        //задаём ожидаемый результат
        double expected = 6D;
        //проверяем результат и ожидаемое значение
        assertThat(result, is(expected));
    }
}