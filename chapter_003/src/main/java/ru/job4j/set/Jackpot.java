package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Джекпот в казино.
 * Выигрышной комбинацией для джекпота в казино считается такая,
 * в которой все элементы одинаковые.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.11.2020
 */
public class Jackpot {
    /**
     * Метод принимает массив строк, который содержит
     * последовательность элементов игровой комбинации.
     * Метод должен вернуть true - если комбинация является выигрышной.
     *
     * @param combination Массив строк.
     * @return При выигрышной ситуации true, иначе false.
     */
    public static boolean checkYourWin(String[] combination) {
        Set<String> s = new HashSet<>(Arrays.asList(combination));
        return s.size() == 1;
    }
}
