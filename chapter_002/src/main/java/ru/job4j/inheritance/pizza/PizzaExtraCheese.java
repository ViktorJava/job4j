package ru.job4j.inheritance.pizza;

/**
 * Классы пиццы с дополнительным сыром.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.02.2023
 */
public class PizzaExtraCheese extends Pizza {
    @Override
    public String name() {
        return super.name() + "+ extra cheese ";
    }
}
