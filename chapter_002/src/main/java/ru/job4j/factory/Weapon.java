package ru.job4j.factory;

/**
 * Интерфейс для возможности производства оружия на фабрике.
 * Любое оружие производимое на фабрике, обязано реализовать данный интерфейс.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.12.2020
 */
public interface Weapon {
    void shoot();
}
