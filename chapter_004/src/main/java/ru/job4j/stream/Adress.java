package ru.job4j.stream;

import java.util.Objects;

/**
 * Модель адреса проживания.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.10.2020
 */
public class Adress {
    private final String city;
    private final String street;
    private final int home;
    private final int apartment;

    public Adress(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Adress adress = (Adress) o;
        return home == adress.home
                && apartment == adress.apartment
                && city.equals(adress.city)
                && street.equals(adress.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public String toString() {
        return "Adress{"
                + "city='" + city
                + '\''
                + ", street='" + street
                + '\''
                + ", home=" + home
                + ", apartment=" + apartment
                + '}';
    }
}
