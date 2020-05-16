package ru.job4j.oop.factorymethod;

/**
 * Фабричный метод.
 * В этой программе, я оттачивал навыки реализации паттерна фабричный метод.
 * Диспетчеру фабрики (конструктору), отправляем флаг необходимого к производству продукта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.05.2020
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Water sprite = (new CreatorFactory(1).create());
        sprite.printTitle();
    }
}








