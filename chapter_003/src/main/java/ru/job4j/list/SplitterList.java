package ru.job4j.list;

import java.util.List;

/**
 * Удаление одного списка из другого.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.11.2020
 */
public class SplitterList {
    /**
     * Метод, возвращающий список, основой которого будет left,
     * присутствовать элементы из middle и точно отсутствовать
     * элементы из right.
     *
     * @param left   Общий список элементов.
     * @param middle Список важных, но не обязательных элементов.
     * @param right  Список элементов, которые обязательно должны.
     * @return Список, основой которого будет left, присутствовать
     * элементы из middle и точно отсутствовать элементы из right.
     */
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        return left;
    }
}
