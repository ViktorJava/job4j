package ru.job4j.array;

/**
 * Четные vs Нечетные.
 * Вам даны очки игроков. Игроки разделись таким образом, что под четными
 * индексами находятся очки первой команды, под нечетными второй.
 * Ваша задача определить, кто выиграл. Выигрывает та команда, которая набрала
 * наибольшее число очков. Если выиграла первая команда, то нужно вернуть 1,
 * если вторая, то 2, если ничья то 0.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/30/2021
 */
public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                even += players[i];
            } else {
                odd += players[i];
            }
        }
        if (even > odd) {
            return 1;
        } else if (odd == even) {
            return 0;
        }
        return 2;
    }
}
