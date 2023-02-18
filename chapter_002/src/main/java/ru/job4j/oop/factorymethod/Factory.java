package ru.job4j.oop.factorymethod;

/**
 * Руководство нашей фабрики производящей разную воду.
 * Знает что фабрика производит воду, но как она это делает, не знает.
 * Это говорит абстрактный метод create().
 * Принимает от диспетчера, команды на производство определённой продукции,
 * в виде флага. Сохраняет флаг для того чтобы производство могло знать какую
 * продукцию производить.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.05.2020
 */
abstract class Factory {
    int flag;

    public Factory(int flag) {
        this.flag = flag;
    }

    abstract Water create();
}
