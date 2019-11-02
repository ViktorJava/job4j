package ru.job4j.different;

/**
 * Tiger-класс потомок,расширяет класс Predator.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.11.2019
 */
public class Tiger extends Predator {
    public Tiger(String name) {
        super(name);
        System.out.println("Tiger");
    }
}
