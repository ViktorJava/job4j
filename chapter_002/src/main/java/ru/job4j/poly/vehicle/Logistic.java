package ru.job4j.poly.vehicle;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.02.2023
 */
public class Logistic {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle[] logistic = {bus, train, plane};
        for (Vehicle vehicle : logistic) {
            vehicle.move();
            System.out.printf("цена 10 литров топлива: %d руб.%n", vehicle.refuel(10));
        }
    }
}
