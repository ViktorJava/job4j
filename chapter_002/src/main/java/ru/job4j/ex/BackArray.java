package ru.job4j.ex;

import java.util.Arrays;

/**
 * Переворачивание массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.01.2020
 */
public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}