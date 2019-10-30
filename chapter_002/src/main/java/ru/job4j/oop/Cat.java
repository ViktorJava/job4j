package ru.job4j.oop;

/**
 * ТЗ [#173489]:котенок гав и его котлета
 * Создаём дополнительное поле private String name. Это поле должно содержать кличку котика.
 * Создаём метод public void giveNick(String nick). Этот метод должен записывать переменную nick в поле name.
 * Изменяем метод void show() так, чтобы при его вызове в консоль выводилась информация: имя котика и что он ел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2019
 */
public class Cat {
    private String food;
    private String name;

    /**
     * Метод выводит на консоль значение полей name и food класса Cat
     */
    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    /**
     * Метод изменяет значение поля name класса Cat
     *
     * @param nick имя
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Метод изменяет значение поля food класса Cat
     *
     * @param meat еда
     */
    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food");
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println();
        System.out.println("There are black's food");
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}

