package ru.job4j.array;

/**
 * ТЗ [#173373]: 6.3. Массив заполнен true или false
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class Check {

    /**
     * Метод должен проверить, что все элементы в массиве являются или true или false
     *
     * @param data массив данных
     * @return true/false
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
