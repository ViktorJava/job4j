package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Created by ViktorJava on 26.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        //создаём объект треугольник
        Triangle triangle = new Triangle();
        //вычисляем площадь
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        //задаём ожидаемый результат
        double expected = 2D;
        //проверяем результат и ожидаемое значение
        assertThat(result, closeTo(expected, 0.1));
    }

}