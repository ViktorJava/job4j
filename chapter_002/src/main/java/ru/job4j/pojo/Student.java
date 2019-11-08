package ru.job4j.pojo;

import java.util.Date;

/**
 * Модель данных - студент.
 * В модели существуют поля: ФИО, группа, дата поступления.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.11.2019
 */
public class Student {
    private String fullName;
    private String group;
    private Date startDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
