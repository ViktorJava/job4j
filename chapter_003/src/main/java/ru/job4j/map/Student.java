package ru.job4j.map;

import java.util.Objects;

/**
 * Модель данных студента.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/4/2021
 */
public class Student {
    private final String name;
    private final String account;
    private final String group;

    public Student(String name, String account, String group) {
        this.name = name;
        this.account = account;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(account, student.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }
}
