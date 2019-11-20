package ru.job4j.oop.profession;

/**
 *
 * professionalSkills-профессиональный навык
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.11.2019
 */
public class Doctor extends Profession {
    private String[] professionalSkills;

    /**
     * Установка диагноза пациента
     *
     * @param pacient переменная типа Pacient()
     */
    public void diagnose(Pacient pacient) {
    }

    public String[] getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(String[] professionalSkills) {
        this.professionalSkills = professionalSkills;
    }
}
