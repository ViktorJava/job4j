package ru.job4j.collection;

import java.util.Objects;

/**
 * Модель данных Order с полями number и name.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.05.2020
 */
public class Order {
    private String number;
    private String name;

    /**
     * Конструктор ордера.
     *
     * @param number номер заказа.
     * @param name   заказ.
     */
    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     * Метод возвращает номер заказа.
     *
     * @return номер заказа.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Для отладки.
     *
     * @return Заказ в виде красивой строки.
     */
    @Override
    public String toString() {
        return "Order{"
                + "number='" + number + '\''
                + ", name='" + name + '\''
                + '}';
    }

    /**
     * Переопределение equals.
     *
     * @param o экземпляр класса Order.
     * @return true в случае равенства объектов, иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(number, order.number)
                && Objects.equals(name, order.name);
    }

    /**
     * Переопределение hashCode.
     *
     * @return hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
