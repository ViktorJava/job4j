package ru.job4j.poly;

/**
 * Этот интерфейс будет определять любой вид транспорта.
 * В интерфейсе объявлено три метода:
 * 1. ехать (без параметров, без возвращаемого типа),
 * 2. пассажиры (принимает число пассажиров, без возвращаемого типа),
 * 3. заправить (принимает кол-во топлива, возвращает цену).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2019
 */
public interface Transport {
    void move();

    void passengers(int amount);

    int refuel(int fuel);
}
