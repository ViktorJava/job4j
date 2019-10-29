package ru.job4j.oop;

/**
 * ТЗ [#173490]:петя баянист и коронная песня "Кузнечик"
 * Написать класс Student.Созать объект petya класса Student.
 * Класс Student должен содержать методы music.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2019
 */
public class Student {
    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
