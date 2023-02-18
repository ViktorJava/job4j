package ru.job4j.loop;

/**
 * Крест в псевдографике. [#177182]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.11.2022
 */
public class Slash {
    /**
     * Метод рисует крест в псевдографике.
     *
     * @param size размер креста в символах.
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row;
                boolean right = cell == size - row - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw 5");
        draw(5);

        System.out.println("Draw 3");
        draw(3);
    }
}
