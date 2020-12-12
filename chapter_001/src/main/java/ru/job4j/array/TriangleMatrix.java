package ru.job4j.array;

/**
 * Заполнить треугольную матрицу.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2020
 */
public class TriangleMatrix {
    /**
     * Метод строит треугольную матрицу по заданному количеству строк.
     *
     * @param count Количество строк в треугольной матрице.
     * @return Треугольная матрица с заданным количеством строк.
     */
    public static int[][] rows(int count) {
        int f = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = f++;
            }
        }
        return triangle;
    }
}
