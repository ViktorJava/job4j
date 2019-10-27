package ru.job4j.array;

/**
 * ТЗ [#173380]:слово заканчивается на...
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class EndsWith {
    /**
     * Этот метод проверяет, что слово заканчивается c определенной последовательности.
     *
     * @param word слово
     * @param post искомая последовательность
     * @return true/false
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
