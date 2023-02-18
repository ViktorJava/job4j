package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс опроса клавиатуры.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2019
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Реализация опроса клавиатуры и ввода данных.
     * Запрашивает и возвращает введённые в консоли данные.
     *
     * @param question запрос ввода данных.
     * @return введённые в виде строки данные.
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Запрашивает и возвращает введённые в консоли данные.
     *
     * @param question запрос ввода данных.
     * @return введённые в виде строки данные целочисленного типа.
     */
    @Override
    public int askInt(String question) {
        return Integer.parseInt(this.askStr(question));
    }

    /**
     * Запрашивает и возвращает введённое число
     * с проверкой заданного диапазона и выбрасыванием
     * экзепшена.
     *
     * @param question запрос ввода данных.
     * @param max      максимальное значение диапазона.
     * @return введённые в виде строки данные целочисленного типа.
     */
    @Override
    public int askInt(String question, int max) {
        int select = this.askInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(
                    String.format("Out of about %s > [0, %s]", select, max)
            );
        }
        return select;
    }
}
