package ru.job4j.condition;

/**
 * Необычные пары.
 * <p>
 * Метод принимает две строки, на выходе метод должен вернуть булево значение.
 * Метод необходимо реализовать таким образом, чтобы:
 * 1. Если обе строки пустые - метод должен вернуть true.
 * 2. Если первая буква первой строки равна последней букве второй строки
 * и последняя буква первой строки равна первой букве второй
 * строки - метод должен вернуть true.
 * 3. Во всех остальных случаях метод должен вернуть false.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2020
 */
public class PairsCharString {
    /**
     * Метод проверяет пару строк на необычность.
     *
     * @param l Проверяемая строка.
     * @param r Проверяемая строка.
     * @return true в случае, если пара необычная иначе false.
     */
    public static boolean check(String l, String r) {
        if (l.equals("") && r.equals("")) {
            return true;
        }
        return l.charAt(0) == r.charAt(r.length() - 1)
                && (l.charAt(l.length() - 1) == r.charAt(0));
    }
}
