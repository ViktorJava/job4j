package ru.job4j.pojo;

import java.util.Date;

/**
 * Модель данных. [#174683]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.11.2019
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Vdovichenko Viktor");
        student.setGroup("T-12");
        student.setStartDate(new Date());
        System.out.println("Студент: " + student.getFullName() + ", зачислен: " + student.getStartDate() + " в группу: " + student.getGroup());
    }
}
