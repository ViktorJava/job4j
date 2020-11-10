package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;


/**
 * Тест преобразования List в Map.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 09.11.2020
 */
public class MapUsageTest {
    @Test
    public void testHashMap() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(30, "Кarabeinikau"));
        students.add(new Student(45, "Hincu"));
        students.add(new Student(20, "Vdovichenko"));
        students.add(new Student(50, "Arsentev"));
        Map<String, Student> map = MapUsage.studentsToMap(students);
        assertThat(map.get("Arsentev"), is(students.get(3)));
    }

    @Test
    public void whenDuplicatesDisabled() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(30, "Кarabeinikau"));
        students.add(new Student(30, "Кarabeinikau"));
        students.add(new Student(45, "Hincu"));
        students.add(new Student(45, "Hincu"));
        students.add(new Student(20, "Vdovichenko"));
        students.add(new Student(20, "Vdovichenko"));
        students.add(new Student(50, "Arsentev"));
        students.add(new Student(50, "Arsentev"));
        Map<String, Student> map = MapUsage.studentsToMap(students);
        assertEquals(4, map.size());
    }
}
