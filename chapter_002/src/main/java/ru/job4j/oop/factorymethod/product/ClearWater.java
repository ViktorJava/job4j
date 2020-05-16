package ru.job4j.oop.factorymethod.product;

import ru.job4j.oop.factorymethod.Water;

/**
 * На основании описания продукции, содаётся рецепт конкретного продукта
 * с его конкретными свойствами, состоянием и поведением. В данном случае- это рецепт
 * изготовления чистой воды.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.05.2020
 */
public class ClearWater implements Water {

    @Override
    public void printTitle() {
        String title = "This is ClearWater";
        System.out.println(title);
    }
}
