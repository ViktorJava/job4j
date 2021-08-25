package ru.job4j.array;

/**
 * Моно строка в матрице. [#214126]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/25/2021
 */
public class MatrixCheckNew {
    /**
     * Метод проверяет элементы в заданной строке массива, что они
     * равны символу 'X'.
     *
     * @param board Массив символов.
     * @param row   Проверяемая строка массива.
     * @return true если заданная строка массива, целиком заполнена символами 'Х'.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет элементы в заданном столбце массива, что они
     * равны символу 'X'.
     *
     * @param board  Массив символов.
     * @param column Проверяемый столбец массива.
     * @return rue если заданный столбец массива, целиком заполнен символами 'Х'.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заполняет одномерный массив элементами диагонали из двухмерного массива.
     *
     * @param board Символьный массив.
     * @return Возвращаемая диагональ.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }
}
