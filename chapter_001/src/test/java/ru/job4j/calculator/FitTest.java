package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 1);
    }

    @Test
    public void womanWeight() {
        double in = 168;
        double expected = 66.7;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 1);
    }
}
