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
}
