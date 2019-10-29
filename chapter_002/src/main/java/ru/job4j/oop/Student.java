package ru.job4j.oop;

/**
 * ТЗ [#173490]:петя баянист и коронная песня "Кузнечик"
 * Написать класс Student.Созать объект petya класса Student.
 * Класс Student должен содержать методы music и song.
 * Попросить Петю три раза спеть и три раза сыграть.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2019
 */
public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
