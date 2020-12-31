package ru.job4j.factory;

/**
 * <h2>Реализация паттерна проектирования Фабрики </h2>
 * На примере завода по производству оружия, реализован
 * паттерн проектирования Фабрика.
 * Фабрика принимает к заказу на производство, тип оружия и в результате,
 * выпускает объект необходимого типа оружия.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.12.2020
 */
public class WeaponFactory {
    /**
     * Фабрика.
     *
     * @param type Тип оружия.
     * @return Объект типа Weapon.
     */
    public Weapon getWeapon(WeaponType type) {
        return switch (type) {
            case GUN -> new Gun();
            case TANK -> new Tank();
            case MACHINEGUN -> new MachineGun();
        };
    }
}
