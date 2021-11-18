package ru.job4j.map.farm;

import java.util.Map;
import java.util.Objects;

/**
 * Ферма.
 * <p>
 * Ответственный фермер решил провести инвентаризацию животных на своей ферме.
 * Просто посчитать их количество ему показалось мало и он решил посчитать
 * сколько ног бегает по его ферме.
 */
public class Farm {
    /**
     * Метод принимает отображение: ключ - объект класса Animal,
     * а значение - количество животных этого класса на ферме.
     * При этом объект класса Animal содержит 2 поля: имя и количество ног
     * у животного. На выходе у нас общая сумма ног животных на ферме.
     *
     * @param data Отображение Map<Animal, Integer>
     * @return Сумма ног животных.
     */
    public static int sumLegs(Map<Animal, Integer> data) {
        int rsl = 0;
        for (Map.Entry<Animal, Integer> entry : data.entrySet()) {
            rsl += entry.getValue() * entry.getKey().getLegs();
        }
        return rsl;
    }

    /**
     * Модель данных описывающая животного.
     */
    public static class Animal {
        /**
         * Имя животного.
         */
        private final String name;
        /**
         * Количество ног у животного.
         */
        private final int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        public String getName() {
            return name;
        }

        public int getLegs() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
