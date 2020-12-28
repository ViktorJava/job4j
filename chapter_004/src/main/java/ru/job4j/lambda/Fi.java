package ru.job4j.lambda;

import java.util.Comparator;

import static java.util.Arrays.sort;

/**
 * <h2>Функциональные интерфейсы. [#173317]</h2>
 * 1. Создайте компаратор для строк через лямбда.
 * Строки должны сравниваться через метод {@code compareTo()}.<p>
 * 2. Создайте компаратор для строк через лямбда.
 * Компаратор должен сортировать строки по убыванию длины.<p>
 * 3. Решение опишите в тексте.
 * <p>
 * Для выполнения данной задачи, применяем функциональный интерфейс
 * {@code Comparator<T>} с абстрактным методом {@code int compare(T o1, T o2)};
 * Для сравнения строк в лексикографическом порядке, применяем
 * метод {@code compareTo()} реализованный в классе {@code String}.
 * Сортировку выполняем статическим методом класса {@code Arrays}
 * см. секцию import.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 1.0
 * @since 20.08.2020
 */
public class Fi {

    // Компаратор для строк через лямбда, сортирующий строки по длине.
    public Attachment[] cmpSize(Attachment[] attachment) {
        Comparator<Attachment> cmpSize =
                (left, right) -> left.getName()
                                     .length() - right.getName()
                                                      .length();
        sort(attachment, cmpSize);
        return attachment;
    }

    // Компаратор для строк через лямбда. Лексикографическая сортировка строк.
    public Attachment[] cmpText(Attachment[] attachment) {
        Comparator<Attachment> cmpText =
                (left, right) -> left.getName()
                                     .compareTo(right.getName());
        sort(attachment, cmpText);
        return attachment;
    }

    // Компаратор для строк через лямбда. Компаратор сортирует
    // строки по убыванию длины.
    public Attachment[] cmpDescSize(Attachment[] attachment) {
        Comparator<Attachment> cmpDescSize =
                (left, righ) -> righ.getName()
                                    .length() - left.getName()
                                                    .length();
        sort(attachment, cmpDescSize);
        return attachment;
    }
}
