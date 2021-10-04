package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Optional в банковских переводах. [#214711]
 * Класс реализующий бизнес-логику колледжа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/4/2021
 */
public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Поиск студента по аккаунту.
     *
     * @param account Аккаунт.
     * @return Optional типа Student или null Optional в случае отсутствия
     * студента с заданным аккаунтом.
     */
    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student s: students.keySet()) {
            if (account.equals(s.getAccount())) {
                rsl = Optional.of(s);
                break;
            }
        }
        return rsl;
    }

    /**
     * Поиск предмета который изучает студент, по аккаунту студента
     * и названию предмета.
     *
     * @param account Аккаунт студента.
     * @param name    Название предмета.
     * @return Optional типа Subject null Optional в случае отсутствия
     * предмета с заданным названием.
     */
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> s = findByAccount(account);
        if (s.isPresent()) {
            Set<Subject> subjects = students.get(s.get());
            for (Subject subj: subjects) {
                if (name.equals(subj.getName())) {
                    rsl = Optional.of(subj);
                    break;
                }
            }
        }
        return rsl;
    }
}
