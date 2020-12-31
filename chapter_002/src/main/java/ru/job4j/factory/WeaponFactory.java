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
    private Integer gunCount = 0;
    private Integer tankCount = 0;
    private Integer machineGunCount = 0;

    /**
     * Фабрика.
     *
     * @param type Тип оружия.
     * @return Объект типа Weapon.
     */
    public Weapon getWeapon(WeaponType type) {
        Weapon result;
        switch (type) {
            case GUN:
                gunCount++;
                result = new Gun();
                break;
            case TANK:
                tankCount++;
                result = new Tank();
                break;
            case MACHINEGUN:
                machineGunCount++;
                result = new MachineGun();
                break;
            default:
                throw new IllegalArgumentException("Wrong argument: " + type);
        }
        return result;
    }

    public void printCount() {
        System.out.println("Кол-во произведено оружия (по типу):");
        System.out.println("Пистолеты:" + gunCount);
        System.out.println("Пулемёты:" + machineGunCount);
        System.out.println("Танки:" + tankCount);
        System.out.println("Всего:" + (gunCount + machineGunCount + tankCount));
    }
}
