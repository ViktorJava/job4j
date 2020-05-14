package collection;

import java.util.List;

/**
 * Конвертация {@code ArrayList} в двумерный массив.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.05.2020
 */
public class ConvertList2Array {
    /**
     * Метод получает на вход список чисел и количество ячеек
     * в строке. На выходе, получаем двумерный массив типа int,
     * с расчётным количеством строк. В процессе расчёта
     * необходимого массива, возникает дефицит элементов,
     * котрый компенсируется нулями.
     *
     * @param list  список чисел.
     * @param cells колличество ячеек в строке.
     * @return
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        //System.out.println(groups);
        int[][] array = new int[groups][cells];
//        System.out.println(Arrays.deepToString(array));
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            cell++;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

    //Для красоты.
//    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.printf("List: %s; \n", list);
//        int[][] rsl = toArray(list, 3); //convert
//        System.out.printf("2ArrayString: %s; \n", Arrays.deepToString(rsl));
//        System.out.println("2Array:");
//        for (int[] row : rsl) {
//            for (int cell : row) {
//                System.out.print(cell + " ");
//            }
//            System.out.println();
//        }
//    }
}
