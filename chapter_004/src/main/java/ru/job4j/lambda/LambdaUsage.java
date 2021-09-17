package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Лямбда блок [#249208].
 * Отладочная информация в лямбда блоке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/16/2021
 */
public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return Integer.compare(left.length(), right.length());
        };
        List<String> ls = Arrays.asList("four", "one", "three");
        ls.sort(cmpDescSize);
        System.out.println(ls);
    }
}
