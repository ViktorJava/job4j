package ru.job4j.array;

/**
 * ТЗ [#173374]: 6.7. Игровое поле представляет из себя массив заполненный символами '_'(подчеркивание)
 * и 'X' - крестик. Цель игры расположить крестики в линию на 5 элементов.
 * Линия может быть горизонтальная или вертикальная. Задачей будет написать метод, который будет проверять,
 * что на поле находится выигрышная ситуация.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 26.09.2019
 */
public class MatrixCheck {

    /**
     * Метод должен проверить, что в квадратном массиве
     * есть строчки или столбцы заполненные только символом 'X'
     * Массив всегда квадратный 5 на 5 элементов
     *
     * @param board массив данных описывающий доску
     * @return результат проверки (наличие вертикальных или горизонтальных строк 'Х')
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int horizontalCells = 0;
        int verticalCells = 0;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X') {
                for (int cell = 0; cell < board.length; cell++) {
                    if (board[row][cell] == 'X') {
                        horizontalCells++;
                    }
                    if (board[cell][row] == 'X') {
                        verticalCells++;
                    }
                }
                if (verticalCells == board.length || horizontalCells == board.length) {
                    result = true;
                    break;
                }
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner: " + win);
        System.out.println();

        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner: " + winHor);
        System.out.println();

        char[][] notWin = {
                {'_', '_', '_', '_', '_'},
                {'X', '_', 'X', 'X', 'X'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        Boolean lose = isWin(notWin);
        System.out.println("A board has a winner: " + lose);
        System.out.println();
    }
}

