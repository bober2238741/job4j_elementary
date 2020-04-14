package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;



public class FitTest {

    @Test
    public void whenWeight180Then92() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWeight160Then65() {
        double in = 160;
        double expected = 65;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}