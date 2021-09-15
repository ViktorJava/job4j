package ru.job4j.poly;

/**
 * Реализация интерфейса Transport
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2019
 */
public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Поехали...");
    }

    @Override
    public void passengers(int amount) {
        System.out.println("Загрузка пассажиров.");
    }

    @Override
    public int refuel(int fuel) {
        int price = 30;
        return fuel * price;
    }
}
