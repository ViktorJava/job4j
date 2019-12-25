package ru.job4j.tracker;

/**
 * Класс-заглушка реализующий интерфейс Input
 * и предназначенный для ввода знаний в наш тест.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.12.2019
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    /**
     * Конструктор класса, который
     * эмулирует ввод данных пользователем.
     *
     * @param answers входящие данные
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }
}