package ru.job4j.loop;

/**
 * Вывести стоимость конфет за килограмм.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2020
 */
public class SweetPrice {
    /**
     * Дано целое число price — цена 1 кг конфет.
     * Вывести стоимость 1, 2, . . . , 5 кг конфет.
     *
     * @param price Стоимость килограмма конфет.
     */
    public static void out(int price) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * price);
        }
    }
}
