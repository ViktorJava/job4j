package ru.job4j.lambda;

import java.util.Comparator;

import static java.util.Arrays.sort;

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
 * Сортировку выполняем статическим методом класса Arrays
 * см. секцию import.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 1.0
 * @since 20.08.2020
 */
public class Fi {

    // Компаратор для строк через лямбда, сортирующий строки по длинне.
    public Attachment[] cmpSize(Attachment[] attachment) {
        Comparator<Attachment> cmpSize = (left, right) -> left.getName().length() - right.getName().length();
        sort(attachment, cmpSize);
        return attachment;
    }

    // Компаратор для строк через лямбда. Лексикографическая сортировка строк.
    public Attachment[] cmpText(Attachment[] attachment) {
        Comparator<Attachment> cmpText = (left, right) -> left.getName().compareTo(right.getName());
        sort(attachment, cmpText);
        return attachment;
    }

    // Компаратор для строк через лямбда. Компаратор сортирует строки по убыванию длины.
    public Attachment[] cmpDescSize(Attachment[] attachment) {
        Comparator<Attachment> cmpDescSize = (left, righ) -> righ.getName().length() - left.getName().length();
        sort(attachment, cmpDescSize);
        return attachment;
    }
}
