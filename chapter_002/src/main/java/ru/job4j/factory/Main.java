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
        Weapon tank = weaponFactory.getWeapon(WeaponType.TANK);
        Weapon machineGun = weaponFactory.getWeapon(WeaponType.MACHINEGUN);
        Weapon gun = weaponFactory.getWeapon(WeaponType.GUN);
        tank.shoot();
        machineGun.shoot();
        gun.shoot();
    }
}
