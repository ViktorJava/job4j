package ru.job4j.condition;

/**
 * Ладьи на шахматной доске.
 * <p>
 * Ладья - это шахматная фигура, которая осуществляет ход по доске только по
 * прямой линии в любом направлении.
 * Метод принимает две строки, каждая из которых означает координаты клетки
 * в которой находятся ладьи разного цвета. Необходимо определить может ли одна
 * ладья побить другую. Для этого нужно определить стоят ли они на одной линии
 * или нет.
 * 1. Если совпадает первый символ у двух клеток - значит ладьи стоят на одной
 * линии - метод должен вернуть true (первый символ - это буква столбца,
 * где стоит фигура);
 * 2. Если совпадает второй символ у двух клеток - значит ладьи стоят на одной
 * линии - метод должен вернуть true (второй символ - это цифра строки,
 * где стоит фигура);
 * Во всех остальных случаях метод должен вернуть false.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2020
 */
public class AttackRook {
    /**
     * Метод проверяет, может ли одна ладья побить другую ладью.
     *
     * @param left  Координаты ладьи на шахматной доске.
     * @param right Координаты ладьи на шахматной доске.
     * @return true в случае нахождения ладьи под ударом, иначе false.
     */
    public static boolean check(String left, String right) {
        return (left.charAt(0) == right.charAt(0))
                || ((left.charAt(1)) == (right.charAt(1)));
    }
}
