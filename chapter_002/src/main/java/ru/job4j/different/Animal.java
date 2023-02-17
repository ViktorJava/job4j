package ru.job4j.different;

/**
 * Конструктор по умолчанию. [#173889]
 * Перегрузка конструктора. [#173890]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.11.2019
 */
public class Animal {
    String name;

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("Animal");
    }
}
