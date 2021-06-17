package ru.job4j.condition;

/**
 * Операторы сравнения в String.
 * Метод menu принимает String name - это название игры.
 * В блоке if мы находим подходящую игру и выводим на консоль приветствие.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.06.2021
 */
public class Games {
    /**
     * Метод принимает String name - это название игры.
     *
     * @param name Приветствие соответствующей игры.
     */
    public static void menu(String name) {
        if (name.equals("super mario")) { /* сравниваем переменную name с "super mario" */
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) { /* Сравнить переменную name с "tanks" */
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) { /* Сравнить переменную name с "tetris" */
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Games.menu("tanks");
    }
}
