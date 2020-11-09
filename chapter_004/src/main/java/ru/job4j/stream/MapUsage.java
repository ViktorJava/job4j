package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * [#173326] Преобразование List в Map.
 * 1. Преобразовать список студентов в Map.
 * 2. В качестве ключа использовать фамилию студента.
 * 3. В качестве значение использовать объект студента.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.11.2020
 */
public class MapUsage {
    /**
     * Метод преобразования списка студентов в Map.
     *
     * @param students Список студентов.
     * @return Карта студентов.
     */
    public static Map<String, Student> studentsToMap(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(Student::getSurname, e -> e));
    }
}
