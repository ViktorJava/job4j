package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <h2>Stream API улучшения [#173329].</h2>
 * <p>
 * Необходимо реализовать метод<p>
 * {@code List<Student> levelOf(List<Student> students, int bound);}<p>
 * Метод должен вернуть список студентов, у которых балл аттестата больше bound.<p>
 * Во входящем списке могут быть {@code null} элементы.
 * <ul> Порядок действий:
 * <li> Используя метод {@code filter} убрать {@code null};
 * <li> Отсортировать список;
 * <li> Используя метод {@code takeWhile}, получить нужный поток;
 * <li> Сохранить поток в {@code List}.
 * </ul>
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                       .filter(Objects::nonNull)
                       .sorted(Comparator.comparing(Student::getScore)
                                         .reversed()
                                         .thenComparing(Student::getSurname))
                       .takeWhile(st -> st.getScore() > bound)
                       .collect(Collectors.toList());
    }
}
