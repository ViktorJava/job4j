package ru.job4j.sort;

import java.util.Arrays;

/**
 * Сдача в кофе машине.
 * В этом задании нужно реализовать механизм возврата монет в лендинговых аппаратах.
 * У вас есть купюра 50, 100 рублей. Вы хотите купить кофе на 35.
 * Если вы засунули 50 рублей, то автомат должен вернут 15 рублей (монетами 10 и 5).
 * Автомат может вернуть только монеты.
 * Для решение этой задачу нужно использовать жадный алгоритм.
 * Его смысл очень прост. Мы берем монету наибольшего номинала - 10.
 * Далее вычитаем из суммы. Если остаток больше 0 то операцию повторяем.
 * Если меньше, то берем монету номиналом меньше.
 * И так пока не дойдет до монеты в 1 рубль. В помощью нее мы добиваем остаток.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.04.2020
 */
public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int delta = money - price;
        if (delta > 0) {
            for (int i = 0; i < coins.length; i++) {
                while (delta - coins[i] >= 0) {
                    delta = delta - coins[i];
                    rsl[size++] = coins[i];
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
