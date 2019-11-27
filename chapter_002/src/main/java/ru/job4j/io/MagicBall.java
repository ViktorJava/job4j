package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Чтение из консоли. Класс Scanner. [#179514]
 * 1. Создайте класс ru.job4j.io.MagicBall.
 * 2. Создайте в нем метод main. В нем попросите пользователя ввести закрытый вопрос.
 * 3. В методе main должен быть объект Scanner для ввода вопроса от пользователя.
 * 4. Через класс Random сгенерируйте число от 0 до 3.
 * Если ответ равен 0, то на консоль нужно вывести "Да".
 * Если ответ - 1, то на консоль нужно вывести "Нет".
 * Во всех остальных случаях напечатать - "Может быть".
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 27.11.2019
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = new Random().nextInt(3);//генерация от нуля до двух

        System.out.print("Я великий Оракул, твою мать, что ты хочешь узнать? ");
        String question = scanner.nextLine();
        switch (answer) {
            case 0:
                System.out.println("Да!");
                break;
            case 1:
                System.out.println("Нет :-(");
                break;
            default:
                System.out.println("Возможно...");
        }
    }
}
