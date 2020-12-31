package ru.job4j.factory;

import java.util.Random;

/**
 * Рандомный класс.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.12.2020
 */
public class RandomWeapon {
    /**
     * Метод стрельбы из случайно произведённого оружия.
     *
     * @param weaponFactory Объект Фабрики по производству оружия.
     */
    public static void shotRandomWeapon(WeaponFactory weaponFactory) {
        Weapon randomWeapon = getRandomWeapon(weaponFactory);
        System.out.println("Ничего себе.");
        randomWeapon.shoot();
    }

    /**
     * Метод производства случайного оружия.
     *
     * @param weaponFactory Объект Фабрики по производству оружия.
     * @return Случайно произведённое оружие.
     */
    public static Weapon getRandomWeapon(WeaponFactory weaponFactory) {
        Random random = new Random();
        WeaponType weaponType = WeaponType
                .values()[random.nextInt(WeaponType.values().length)];
        return (weaponFactory.getWeapon(weaponType));
    }
}
