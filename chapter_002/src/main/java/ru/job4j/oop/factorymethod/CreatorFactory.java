package ru.job4j.oop.factorymethod;

import ru.job4j.oop.factorymethod.product.ClearWater;
import ru.job4j.oop.factorymethod.product.DryWater;
import ru.job4j.oop.factorymethod.product.GreenWater;

/**
 * Сама фабрика с конвейерами, производственными линиями
 * реализующими технологический процесс по производству воды.
 * В методе create() реализованы производственные мощности.
 * Конструктор- это диспетчер, принимающий команду на
 * производство необходимой продукции.
 * Заявка на производство в виде флага, передаётся администрации
 * это родительский класс Factory.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.05.2020
 */
class CreatorFactory extends Factory {

    public CreatorFactory(int flag) {
        super(flag);
    }

    @Override
    Water create() {
        if (flag == 0) {
            return new DryWater();
        }
        if (flag == 1) {
            return new GreenWater();
        }
        if (flag == 2) {
            return new ClearWater();
        }
        throw new IllegalArgumentException();
    }
}
