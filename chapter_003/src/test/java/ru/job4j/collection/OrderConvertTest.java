package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты конвертора заказов в карту.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.05.2020
 */
public class OrderConvertTest {
    /**
     * Тест одного заказа.
     */
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }
}
