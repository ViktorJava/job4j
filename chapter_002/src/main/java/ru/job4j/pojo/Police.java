package ru.job4j.pojo;

import java.util.Date;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.11.2019
 */
public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Viktor Vdovichenko");
        license.setModel("Forza");
        license.setCode("AP7392CO");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " владелец автомобиля " + license.getModel() + " номер: " + license.getCode());
    }
}
