package ru.job4j.condition;

/**
 * Математические операторы и составные операторы присваивания.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.02.2023
 */
public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie. ";
        int year = 2022;
        idea += year;
        System.out.println(idea);
    }
}
