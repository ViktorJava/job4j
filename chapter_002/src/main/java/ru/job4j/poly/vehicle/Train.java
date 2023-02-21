package ru.job4j.poly.vehicle;

/**
 * Поезд.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.02.2023
 */
public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам.");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 60;
    }
}
