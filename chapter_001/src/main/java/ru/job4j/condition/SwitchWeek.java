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
        String name;

        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресение";
                break;
            default:
                name = "Ошибка";
        }
        return name;
    }
}
