package ru.job4j.collection;

import java.util.Objects;

/**
 * Модель данных.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/2/2021
 */
public class Citizen {
    private final String passport;
    private final String username;

    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Citizen{"
                + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + '}';
    }

    public String getPassport() {
        return passport;
    }

    @SuppressWarnings("unused")
    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return passport.equals(citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
