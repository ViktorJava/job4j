package ru.job4j.loop;

/**
 * Найти количество отрезков, используя цикл.
 * Даны два целых положительных числа length, section. length это расстояние.
 * Вам нужно не используя операцию деления найти сколько раз отрезок длиной
 * section помещает в length.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/14/2021
 */
public class SectionCount {
    /**
     * Метод считает, сколько раз отрезок длиной section помещает в length.
     *
     * @param length  Размер области размещения отрезков длинной в section.
     * @param section Длинна отрезка.
     * @return Сколько раз отрезок помещается в заданной области.
     */
    public static int count(int length, int section) {
        int count = 0;
        while (section <= length) {
            section += section;
            count++;
        }
        return count;
    }
}
