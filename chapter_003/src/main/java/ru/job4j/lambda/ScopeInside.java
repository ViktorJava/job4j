package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * Зона видимости в лямбда [#173319]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.08.2020
 */
public class ScopeInside {

    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int sum = total;
            int num = number[i];
            total = add(
                    () -> sum + num);
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
