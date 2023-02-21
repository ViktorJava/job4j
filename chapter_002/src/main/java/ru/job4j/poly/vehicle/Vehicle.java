package ru.job4j.poly.vehicle;

/**
 * Интерфейс транспортного средства.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.02.2023
 */
public interface Vehicle {
    void move();

    int refuel(int fuel);
}
