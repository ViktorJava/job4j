package ru.job4j.oop;

/**
 * ТЗ [#173494]:магические сосуды.
 * Создать класс Battery.В нем должно быть поле private int load.
 * Создать метод public void exchange(Battery another).
 * Этот метод должен списывать заряд из батареи у кого вызывали
 * метод exchange и добавить к объекту another.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.10.2019
 */
public class Battery {
    private int load;

    /**
     * конструктор
     *
     * @param size начальный заряд батареи
     */
    public Battery(int size) {
        this.load = size;
    }

    /**
     * метод обмена зарядами из текущей батареи в another батарею.
     *
     * @param another батарея в которую нужно добавить заряд
     */
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(50);
        System.out.println("first: " + first.load + " second: " + second.load);
        first.exchange(second);
        System.out.println("first: " + first.load + " second: " + second.load);
    }
}
