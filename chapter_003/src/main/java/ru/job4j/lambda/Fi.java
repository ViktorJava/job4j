package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Функциональные итерфейсы. [#173317]
 * 1. Создайте компаратор для строк через лямбда.
 * Строки должны сравниваться через метод compareTo().
 * 2. Создайте компаратор для строк через лямбда.
 * Компаратор должен сортировать строки по убыванию длины.
 * 3. Решение опишите в тексте.
 * <p>
 * Для выполнения данной задачи, применяем функциональный интерфейс
 * Comparator<T> с абстрактным методом int compare(T o1, T o2);
 * Для сравнения строк в лексикографическом порядке, применяем
 * метод compareTo() реализованный в классе String.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.08.2020
 */
public class Fi {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("Cats and dogs", 32756),
                new Attachment("People", 865),
                new Attachment("Home and architect", 19768)
        };

        /*
        Компаратор для строк через лямбда, сортирующий строки по длинне.
        [{name='People', size=865}, {name='Cats and dogs', size=32756}, {name='Home and architect', size=19768}]
         */
        Comparator<Attachment> cmpSize = (left, right) -> left.getName().length() - right.getName().length();
        Arrays.sort(atts, cmpSize);
        System.out.println("Сортировка строки по возрастанию длинны.");
        System.out.println(Arrays.toString(atts));

        /*
        Компаратор для строк через лямбда. Лексикографическая сортировка строк.
        [{name='Cats and dogs', size=32756}, {name='Home and architect', size=19768}, {name='People', size=865}]
         */
        Comparator<Attachment> cmpText = (left, right) -> left.getName().compareTo(right.getName());
        Arrays.sort(atts, cmpText);
        System.out.println("Лексикографическая сортировка строк.");
        System.out.println(Arrays.toString(atts));

        /*
        Компаратор для строк через лямбда. Компаратор сортирует строки по убыванию длины.
        [{name='Home and architect', size=19768}, {name='Cats and dogs', size=32756}, {name='People', size=865}]
         */
        Comparator<Attachment> cmpDescSize = (left, righ) -> righ.getName().length() - left.getName().length();
        Arrays.sort(atts, cmpDescSize);
        System.out.println("Сортировка строки по убыванию длины.");
        System.out.println(Arrays.toString(atts));
    }
}
