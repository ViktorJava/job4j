package ru.job4j.poly.vehicle;

/**
 * Автобус.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.02.2023
 */
public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус едет по дороге.");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 47;
    }
}
