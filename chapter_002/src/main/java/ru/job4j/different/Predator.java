package ru.job4j.different;

/**
 * Predator-класс потомок,расширяет класс Animal.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.11.2019
 */
public class Predator extends Animal {
    public Predator(String name) {
        super(name);
        System.out.println("Predator");
    }
}
