package ru.job4j.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Класс-фильтр списка данных типа Folder.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/15/2021
 */
public class SearchFolder {
    /**
     * Метод выполняет проверки над списком данных типа Folder, согласно
     * условиям типа Predicate.
     *
     * @param list Список элементов типа Folder.
     * @param pred Предикат.
     * @return Список элементов типа Folder отфильтрованный согласно условиям
     * предиката.
     */
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder folder: list) {
            if (pred.test(folder)) {
                rsl.add(folder);
            }
        }
        return rsl;
    }
}
