package ru.job4j.condition;

/**
 * ТЗ [#173348]:Вам необходимо разработать программу "Глупый бот".
 * Бот должен принимать строку и возвращать ответ.
 * Бот наш глупый. Он умеет отвечать только на три Фразы.
 * Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."
 * Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."
 * Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик.
 * Задайте другой вопрос." Помните, что строки можно сравнивать только
 * через методы equals. Нельзя использовать ==
 *
 * @author Created by ViktorJava on 26.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class DummyBot {
    /**
     * метод возвращает ответ на известные ему вопросы.
     *
     * @param question Вопрос клиента.
     * @return Ответ на вопрос клиента.
     */
    public String answer(String question) {

        String rsl = "Это ставит меня в тупик. Задайте другой вопрос";
        if ("Привет, Бот".equals(question)) {
            rsl = "Привет, умник!";
        } else if ("Пока, Бот".equals(question)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }
}
