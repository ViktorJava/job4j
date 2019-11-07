package ru.job4j.oop.profession;

/**
 * Инженерный класс.
 * в полях:
 * projects наличие и перечень имеющихся проектов
 * skills навыки инженера (где и кем работал)
 * experience опыт работы
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.11.2019
 */
public class Engineer extends Profession {
    private String[] projects;
    private String[] skills;
    private int experience;

    /**
     * Создание проекта
     */
    public void createProject(Project project) {
    }

    public String[] getProjects() {
        return projects;
    }

    public String[] getSkills() {
        return this.skills;
    }

    public int getExperience() {
        return experience;
    }
}
