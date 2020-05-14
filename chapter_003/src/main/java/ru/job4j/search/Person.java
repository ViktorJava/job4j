package ru.job4j.search;

/**
 * Класс человека.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.05.2020
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String addres;

    /**
     * Конструктор.
     *
     * @param name    имя.
     * @param surname фамилия.
     * @param phone   номер телефона.
     * @param addres  адресс проживания.
     */
    public Person(String name, String surname, String phone, String addres) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.addres = addres;
    }

    /**
     * Метод возвращающий имя.
     *
     * @return имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод возвращающий фамилию.
     *
     * @return фамилия.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод возвращающий номер телефона.
     *
     * @return номер телефона.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Метод возвращающий адресс проживания.
     *
     * @return адресс проживания.
     */
    public String getAddres() {
        return addres;
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", phone='" + phone + '\''
                + ", addres='" + addres + '\''
                + '}';
    }
}
