package ru.job4j.poly.vehicle;

/**
 * Самолёт.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.02.2023
 */
public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолёт летит по воздуху.");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 87;
    }
}
