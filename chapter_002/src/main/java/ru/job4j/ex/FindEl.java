package ru.job4j.ex;

/**
 * Обработка исключительных ситуаций.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.01.2020
 */
public class FindEl {
    /**
     * Поиск индекса элемента в массиве.
     *
     * @param value массив данных.
     * @param key   искомое значение.
     * @return индекс найденного элемента.
     * @throws ElementNotFoundException Элемент не найден.
     */
    private static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] == key) {
                result = index;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found: [" + key + "]");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] source = {"One", "Two", "Three"};
        try {
            int index = indexOf(source, "One");
            System.out.println("OK. Item found: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
