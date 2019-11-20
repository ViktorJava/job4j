package ru.job4j.tracker;

/**
 * Класс модель Item. Item описывает бизнес модель заявки.
 * Заявка имеет 2 поля: имя и уникальный идентификатор.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 27.10.2019
 */
public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}