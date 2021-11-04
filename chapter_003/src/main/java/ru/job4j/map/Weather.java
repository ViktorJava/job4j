package ru.job4j.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Данные об осадках.
 * <p>
 * Метод принимает список объектов Info. При этом эти объекты содержат
 * два поля:
 * <p>
 * 1. city - название города, где производились наблюдения;
 * <p>
 * 2. rainfall - количество осадков, которые выпали в этом городе
 * за период наблюдения.
 * <p>
 * Необходимо реализовать метод так, чтобы в результате вернулся список
 * объектов Info, в котором будет указано название города
 * наблюдения и общее количество осадков за период наблюдения.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.11.2021
 */
public final class Weather {
    private Weather() {
    }

    /**
     * Метод возвращает список объектов Info, в котором будет указано
     * название города наблюдения и общее количество осадков
     * за период наблюдения.
     *
     * @param list Список объектов типа Info.
     * @return Список объектов типа Info.
     */
    public static List<Info> editData(final List<Info> list) {
        List<Info> rsl;
        Map<String, Integer> map = new HashMap<>();
        for (Info info: list) {
            map.computeIfPresent(info.getCity(), (oldV, newV) -> newV + info.getRainfall());
            map.putIfAbsent(info.getCity(), info.getRainfall());
        }
        rsl = map
                .keySet()
                .stream()
                .map(s -> new Info(s, map.get(s)))
                .collect(Collectors.toList());
        return rsl;
    }

    static class Info {
        private final String city;
        private final int rainfall;

        public Info(final String city, final int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
