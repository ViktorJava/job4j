package ru.job4j.oop.profession;

/**
 * Класс стоматолога
 * prosthetics- протезирование зубов
 * remove- удаление зубов
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.11.2019
 */
public class Dentist extends Doctor {
    private boolean prosthetics;
    private boolean remove;

    /**
     * ремонт зубов
     */
    public void repairs(int tooth) {
    }

    public boolean getProsthetics() {
        return prosthetics;
    }

    public boolean getRemove() {
        return remove;
    }
}
