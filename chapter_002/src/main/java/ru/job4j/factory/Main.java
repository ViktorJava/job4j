package ru.job4j.factory;

/**
 * Временный класс для тестирования реализации паттерна проектирования.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.12.2020
 */
public class Main {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new WeaponFactory();
        for (int i = 0; i < 100; i++) {
            RandomWeapon.shotRandomWeapon(weaponFactory);
        }
        weaponFactory.printCount();
    }
}
