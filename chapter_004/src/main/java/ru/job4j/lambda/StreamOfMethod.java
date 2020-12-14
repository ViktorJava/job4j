package ru.job4j.lambda;

import java.util.stream.Stream;

/**
 * Создание стрима из последовательности. Метод Stream.of()
 * <p>
 * Необходимо создать стрим из символов 'a', 'b', 'c'.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.12.2020
 */
public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
