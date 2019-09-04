package ru.job4j.loop;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.09.2019
 */
public class Mortgage {

    public int year(int amount, int monthly, int percent) {
        int year = 0;
        int countMonth = 0;
        double increase = ((50.0 / 100.0) * 100.0);
        double bill = increase + amount;

        while (bill > 0) {
            bill = bill - monthly;
            countMonth++;
        }
        year = countMonth / 12;
        return year;
    }

}
