package ru.job4j.condition;

/**
 * Оператор && [#333783]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/24/2021
 */
public class NewGame {
    /**
     * Метод permission должен вывести на консоль
     * решение о посещении игрового клуба.
     *
     * @param allowByParent Разрешения от родителей.
     * @param hasMoney      Есть ли у клиента деньги.
     */
    public static void permaission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can not.");
        }
    }

    public static void main(String[] args) {
        permaission(true, true);
        permaission(true, false);
        permaission(false, true);
        permaission(false, false);
    }
}
