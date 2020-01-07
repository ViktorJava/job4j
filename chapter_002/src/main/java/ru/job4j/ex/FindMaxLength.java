package ru.job4j.ex;

/**
 * Диагностика NPE (NullPointerException).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.01.2020
 */
public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if ((el != null) && (el.length() > max)) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}