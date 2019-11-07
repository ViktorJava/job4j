package ru.job4j.oop.profession;

/**
 * base fields and methods Super class:
 * name- professional name
 * surname- professional surname
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.11.2019
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private long birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public long getBirthday() {
        return birthday;
    }

}
