package ru.job4j.factory;

/**
 * Танк умеет производить фабрика.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.12.2020
 */
public class Tank implements Weapon {
    @Override
    public void shoot() {
        System.out.println("Стреляет танк");
    }
}
