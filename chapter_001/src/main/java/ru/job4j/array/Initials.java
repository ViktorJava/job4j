package ru.job4j.array;

/**
 * Инициалы.
 * Дан массив из трех элементов. В нем записаны соответственно
 * Фамилия Имя Отчество. Ваша задача получить инициалы.
 * Например, "Иванов", "Роман", "Иванович" -> "Иванов Р.И."
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.12.2020
 */
public class Initials {
    /**
     * Метод создаёт инициалы.
     *
     * @param fio Фамилия Имя Отчество
     * @return Фамилия И.О.
     */
    public static String convert(String[] fio) {
        String surname = fio[0];
        char name = Character.toUpperCase(fio[1].charAt(0));
        char patronymic = Character.toUpperCase(fio[2].charAt(0));
        return String.format("%s %s.%s.", surname, name, patronymic);
    }
}
