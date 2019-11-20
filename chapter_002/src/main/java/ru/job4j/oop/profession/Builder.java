package ru.job4j.oop.profession;

/**
 * Класс строителя. Поля класса:
 * license- наличие лицензии на специальные виды работ (работа на высоте,
 * верхолазные работы)
 * drawing- умение работы с чертежами проекта и проектной документацией
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.11.2019
 */
public class Builder extends Engineer {
    private boolean license;
    private boolean drawing;

    /**
     * построит объект
     */
    public void buildObject() {
    }

    public boolean getLicense() {
        return license;
    }

    public boolean getDrawing() {
        return drawing;
    }
}
