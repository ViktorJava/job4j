package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Реализация интерфейса. Выполняется опрос клавиатуры.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2019
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Реализация опроса клавиатуры и ввода данных от пользователя.
     * Возвращает введённую строку от пользователя.
     *
     * @param question запрос данных
     * @return полученные данные
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}