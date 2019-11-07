package ru.job4j.oop.profession;

/**
 * программист
 * certificate- наличие дипломов и сертификатов
 * english- знание английского языка
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.11.2019
 */
public class Programmer extends Engineer {
    private String[] certificate;
    private boolean english;

    /**
     * создать программу
     */
    public void createProgramm() {
    }

    public boolean getEnglish() {
        return english;
    }

    public String[] getCertificate() {
        return certificate;
    }

}
