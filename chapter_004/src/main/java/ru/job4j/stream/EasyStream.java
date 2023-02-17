package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <h2>EasyStream [#401629]</h2>
 * Представьте, что разработчики <b>JDK</b> не сделали <b>Stream API</b>.
 * <p>В этом задании, нужно реализовать каркас упрощенного <b>Stream API</b>.
 * <p>{@link EasyStream} работает только с типом {@link Integer}.
 * В нем есть четыре метода:
 * <li>of - получает исходные данные.
 * <li>map - преобразует число в другое число.
 * <li>filter - фильтрует поток элементов.
 * <li>collect - собирает все элементы из source по заданным условиям map и filter.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @implNote В этом задании нужно: <li>Использовать шаблон проектирования Builder.
 * <li>Реализовать класс {@link EasyStream}. <li>Проверить реализацию тестами.
 * @since 17.01.2021
 */
public class EasyStream {
    private final List<Integer> source;

    public EasyStream(List<Integer> source) {
        this.source = source;
    }

    /**
     * Метод получает исходные данные.
     *
     * @param source Список данных целочисленного типа.
     * @return Объект типа EasyStream.
     */
    public static EasyStream of(List<Integer> source) {
        return new EasyStream(source);
    }

    /**
     * Метод преобразует число в другое число.
     *
     * @param fun Функция преобразования Integer в Integer.
     * @return Объект типа EasyStream.
     */
    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> list = new ArrayList<>();
        for (Integer element : source) {
            list.add(fun.apply(element));
        }
        return new EasyStream(list);
    }

    /**
     * Метод фильтрует поток элементов.
     *
     * @param fun Предикат целочисленного типа.
     * @return Объект типа EasyStream.
     */
    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> list = new ArrayList<>();
        for (Integer element : source) {
            if (fun.test(element)) {
                list.add(element);
            }
        }
        return new EasyStream(list);
    }

    /**
     * Метод собирает все элементы из source по заданным условиям map и filter.
     *
     * @return Массив чисел целочисленного типа.
     */
    public List<Integer> collect() {
        return new ArrayList<>(source);
    }
}
