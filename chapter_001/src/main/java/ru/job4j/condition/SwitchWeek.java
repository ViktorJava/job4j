package ru.job4j.condition;

/**
 * Switch [#334070].
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/24/2021
 */
public class SwitchWeek {
    /**
     * Метод находит день недели в зависимости от его порядкового номера.
     *
     * @param day Номер дня недели.
     * @return День недели.
     */
    public static String nameOfDay(int day) {

        return switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресение";
            default -> "Ошибка";
        };
    }
}
