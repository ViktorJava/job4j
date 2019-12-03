package ru.job4j.io;

import java.util.Scanner;

/**
 * Scanner и чтение числа из консоли. [#179518]
 * В этом задании, необходимо сделать игру 11. Смысл игры в следующем. На столе лежат 11 спичек.
 * Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.
 * <p>
 * 1. Создайте класс ru.job4j.io.Matches с методом main.
 * 2. В методе main добавьте цикл. Игра заканчивается, когда игрок забрал последние спички.
 * В цикле нужно проверять количество спичек.
 * 3. Сделайте ввод данных от пользователя. По порядку.
 * Сначала первый игрок вводит число от 1 до 3, потом второй и так далее.
 * <p>
 * Когда игрок ввел цифру, нужно показать сколько спичек осталось на столе.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.11.2019
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stick = 11;
        boolean run = true;
        boolean player1 = true;

        System.out.println("Игра 11.");
        System.out.println("На столе лежат 11 спичек.\n"
                + "Два игрока по очереди берут от 1 до 3 спичек.\n"
                + "Выигрывает тот, кто забрал последние спички.");
        System.out.println();

        while (run) {
            System.out.println("Осталось спичек: " + stick);
            if (player1) {
                player1 = false;
                System.out.print("Первый игрок, тяни спички: ");
            } else {
                player1 = true;
                System.out.print("Второй игрок, тяни спички: ");
            }
            int select = Integer.parseInt(input.nextLine());
            stick -= select;
            if (stick <= 0) {
                if (player1) {
                    System.out.println("Второй победил");
                } else {
                    System.out.println("Первый победил");
                }
                run = false;
            }
        }
    }
}