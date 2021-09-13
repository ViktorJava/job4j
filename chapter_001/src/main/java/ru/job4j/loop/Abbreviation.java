package ru.job4j.loop;

/**
 * Аббревиатуры.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/13/2021
 */
public class Abbreviation {
    /**
     * Метод принимает строку, которая состоит из нескольких слов,
     * каждое из которых начинается с прописной буквы.
     * Из полученной строки формируем аббревиатуру.
     * Входная строка не валидируется на предмет слов с маленькой буквы и на
     * двойные пробелы между словами.
     *
     * @param s Входная строка.
     * @return Аббревиатура.
     */
    public static String collect(String s) {
        String[] split = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String firstChar: split) {
            res.append(firstChar.charAt(0));
        }
        return String.valueOf(res);
    }
}
