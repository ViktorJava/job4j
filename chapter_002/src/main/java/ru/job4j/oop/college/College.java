package ru.job4j.oop.college;

/**
 * Приведение типов. Повышение типа и понижение типа [#181322]
 * 1. Создайте классы в пакете ru.job4j.oop; Object > Student > Freshman.
 * 2. Создайте класс ru.job4j.oop.College с методом main.
 * В нем сделайте приведение объекта Freshman к Student, а потом к Object.
 * 3. Ответьте на вопрос к какому типу приведения это относится?
 * (downcasting - понижающее приведение)
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2019
 */
public class College {
    public static void main(String[] args) {
        // создаём объект класса Freshman
        Freshman freshman = new Freshman();
        // делаем приведение к типу родителя Student.
        Student student = freshman;
        // делаем приведение к типу родителя Object.
        Object object = freshman;
    }
}