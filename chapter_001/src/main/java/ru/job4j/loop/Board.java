package ru.job4j.loop;

/**
 * TЗ [#173363]: 5.3. Построить шахматную доску в псевдографике
 *
 * @author Created by ViktorJava on 01.09.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class Board {
    /**
     * Метод paint(int width, int height) должен возвращать шахматную доску из символов "х" и пробелов
     *
     * @param width ширина доски
     * @param height высота доски
     * @return строка символов
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
