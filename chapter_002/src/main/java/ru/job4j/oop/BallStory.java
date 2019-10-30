package ru.job4j.oop;

/**
 * ТЗ [#173492]:петя и красная шапочка.
 * Сделать классы для описание сказки колобок.
 * Сделать 4 класса Ball, Hare, Wolf, Fox.
 * В каждом классе должен быть метод public void tryEat(Ball ball).
 * Создайте класс BallStory с методом main и описать историю через  объекты.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2019
 */
public class BallStory {
    /**
     * В данном методе описывается сценарий сказки о колобке
     *
     * @param args аргументы запуска класса
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.talk();
        wolf.tryEat(ball);
        ball.talk();
        fox.tryEat(ball);
        ball.talk();
        fox.kill(ball);
    }
}
