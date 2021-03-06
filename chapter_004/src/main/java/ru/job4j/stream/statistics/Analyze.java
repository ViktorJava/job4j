package ru.job4j.stream.statistics;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * <h2>Крестики-нолики на JavaFX [#173333]</h2>
 * Класс Analyze получает статистику по аттестатам.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.01.2021
 */
public class Analyze {
    /**
     * <h2>Метод вычисляет общий средний балл.</h2>
     * <li> {@code flatMap()} для преобразования в поток объектов {@link Subject}
     * <li> {@code mapToInt()} для последующего преобразования в поток оценок по
     * каждому предмету;
     * <li> {@code average()} для расчета среднего бала по предмету;
     * <li> {@code orElse()} для того чтобы вернуть значение по умолчанию.
     *
     * @param stream Поток объектов типа {@link Pupil}
     * @return Общий средний балл.
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(x -> x.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D);
    }

    /**
     * <h2>Метод вычисляет средний балл ученика по его предметам.</h2>
     * Возвращает список из объекта {@link Tuple} (имя ученика и средний балл).
     * Поскольку нам надо выполнить преобразование в поток объектов класса
     * {@link Tuple}, последовательность будет следующей:
     * <li> метод {@code map()} для преобразования в поток объектов
     * класса {@link Tuple}, внутри метода мы будем создавать эти объекты -
     * там будет фигурировать строка {@code new Tuple()}
     * <li> при этом в конструктор первым параметром будет передаваться имя
     * текущего объекта {@link Pupil} - используем соответствующий геттер;
     * <li> вторым параметром рассчитанный средний балл - расчет можно произвести
     * по той же последовательности, что описана для метода averageScore;
     * <li> последним методом будет {@code collect()}, с помощью которого мы все
     * соберем в коллекцию {@link List}.
     *
     * @param stream Поток объектов типа {@link Pupil}
     * @return Список объектов типа {@link Tuple}
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(s -> new Tuple(s.getName(), s
                        .getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D)))
                .collect(toList());
    }

    /**
     * <h2>Метод вычисляет средний балл по всем предметам для каждого ученика.</h2>
     * Возвращает список из объекта {@link Tuple} (название предмета и средний балл).<p>
     * Реализация этого метода несколько сложна, поскольку в данном случае
     * требуется выполнить промежуточный сбор данных в {@code Map()}.
     * Опишем вкратце алгоритм:
     * <li> {@code flatMap()} для преобразования в поток объектов {@link Subject};
     * <li>  метод {@code collect()} в который мы передаем метод {@code groupingBy()}
     * (минимум с двумя параметрами) класса Collectors.
     * При этом карта собирается следующим образом:
     * ключ - это имя предмета, значение - средний балл по этому предмету
     * для каждого ученика. Для расчета среднего балла
     * используйте метод {@code averagingDouble()} класса Collectors;
     * <li>  после этого собранную карту мы разбираем с помощью {@code entrySet()}
     * и открываем поток с помощью {@code stream()}
     * <li>  полученный поток с помощью {@code map()} преобразуем в поток объектов класса
     * {@link Tuple}, внутри метода мы будем создавать эти объекты -
     * там будет фигурировать строка new {@code Tuple()};
     * <li>  в конструктор мы будем передавать параметры с помощью методов
     * {@code getKey()} и {@code getValue()} интерфейса {Entry};
     * <li>  последним методом будет {@code collect()}, с помощью которого мы все соберем
     * в коллекцию {@link List}.
     *
     * @param stream Поток объектов типа {@link Pupil}
     * @return Список объектов типа {@link Tuple}
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(groupingBy(Subject::getName, LinkedHashMap::new,
                        averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(v -> new Tuple(v.getKey(), v.getValue()))
                .collect(toList());
    }

    /**
     * <h2>Метод возвращает лучшего ученика.</h2>
     * Лучшим считается ученик с наибольшим баллом по всем предметам.
     * Для реализации данного метода можно использовать метод
     * averageScoreBySubject за исключением следующих особенностей:
     * <li> в данном методе мы рассчитываем суммарный балл, а не средний -
     * поэтому вместо {@code average()} нужно использовать метод {@code sum()};
     * <li> терминальной операцией будет не метод {@code collect()},
     * а использование метода {@code max()}, в который будем передавать
     * компаратор. При этом компаратор определит объект {@link Tuple},
     * у которого значение score будет максимальным;
     * <li> {@code orElse()} для того чтобы вернуть значение по умолчанию.
     *
     * @param stream Поток объектов типа {@link Pupil}
     * @return Лучший ученик, с наибольшим баллом по всем предметам.
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.getName(), pupil
                        .getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .sum()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);

    }

    /**
     * <h2>Метод возвращает предмет с наибольшим баллом для всех студентов.</h2>
     * Возвращает объект {@link Tuple} (имя предмета, сумма баллов каждого ученика
     * по этому предмету)<p>
     * Для реализации данного метода можно использовать метод
     * averageScoreByPupil за исключением следующих особенностей:
     * <li> в данном методе мы рассчитываем суммарный балл,
     * а не средний - поэтому вместо {@code averagingDouble()} нужно
     * использовать метод {@code summingDouble()}
     * <li>  терминальной операцией будет не метод {@code collect()},
     * а использование метода {@code max()}, в который будем передавать компаратор.
     * При этом компаратор определит объект {@link Tuple}, у которого значение
     * score будет максимальным;
     * <li>  {@code orElse()} для того чтобы вернуть значение по умолчанию.
     * Все методы нужно реализовывать в одном потоке, т.е. пишете return
     * и последовательно вызываете все методы, о которых было указано выше.
     *
     * @param stream Поток объектов типа {@link Pupil}
     * @return Предмет с наибольшим баллом для всех студентов.
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(e -> new Tuple(e.getKey(), e.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }
}
