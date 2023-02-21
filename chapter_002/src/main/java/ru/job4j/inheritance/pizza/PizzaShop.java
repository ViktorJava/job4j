package ru.job4j.inheritance.pizza;

/**
 * Демонстрация работы наследования, переопределение родительского метода.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.02.2023
 */
public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato =
                new PizzaExtraCheeseExtraTomato();
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}
