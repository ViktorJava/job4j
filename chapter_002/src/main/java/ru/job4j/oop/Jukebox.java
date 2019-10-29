package ru.job4j.oop;

/**
 * ТЗ [#173491]:Музыкальный автомат.
 * Сделать класс Jukebox.
 * Добавить в него метод public void music(int position).
 * Внутри метода сделать if else.
 * Если position равно 1, то в консоль должны выводиться слова песни "Пусть бегут неуклюже".
 * Если равно 2, то в консоль должны выводиться слова песни "Спокойной ночи".
 * Во всех остальных случаях должно появиться "Песня не найдена".
 * 4. Написать метод main с демонстрацией работы этого метода и объекта этого класса.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2019
 */
public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(3);
    }
}
