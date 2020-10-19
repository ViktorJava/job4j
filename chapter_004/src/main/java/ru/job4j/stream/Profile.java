package ru.job4j.stream;

/**
 * Модель анкеты клиента.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.10.2020
 */
public class Profile {
    private final Adress adress;

    public Profile(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }
}

