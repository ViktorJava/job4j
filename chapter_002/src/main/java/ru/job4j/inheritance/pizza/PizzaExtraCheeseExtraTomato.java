package ru.job4j.inheritance.pizza;

/**
 * Класс пиццы с дополнительными помидорами.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.02.2023
 */
public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + "+ extra tomato";
    }
}
