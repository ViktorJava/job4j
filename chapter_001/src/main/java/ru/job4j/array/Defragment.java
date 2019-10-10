package ru.job4j.array;

/**
 * ТЗ [#173376] 6.8. Удаление дубликатов в массиве.
 * необходимо написать код, который будет перемещать заполненные ячейки массива в начало,
 * а пустые в конец.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2019
 */
public class Defragment {

    /**
     * метод удаления элемента со сдвигом
     *
     * @param array фрагментированный массив
     * @return дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int nextCell = index + 1;
                while (array[index] == null && nextCell < array.length) {
                    array[index] = array[nextCell];
                    array[nextCell] = null;
                    nextCell++;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
