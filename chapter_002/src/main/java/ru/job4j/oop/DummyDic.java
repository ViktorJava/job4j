package ru.job4j.oop;

/**
 * ТЗ [#173493]:Переводчик Русский-Английский.
 * Создать класс DummyDic.
 * Создать в нем метод public String engToRus(String eng).
 * Метод должен вернуть строчку "Неизвестное слово. " + eng.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2019
 */
public class DummyDic {
    /**
     * Метод возвращает строку:"Неизвестное слово. " + eng
     *
     * @param en любое английское слово
     * @return возвращаемая строка
     */
    public String engToRus(String en) {
        String text = "Неизвестное слово: " + en;
        return text;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String result = dictionary.engToRus("dude");
        System.out.println(result);
    }
}
