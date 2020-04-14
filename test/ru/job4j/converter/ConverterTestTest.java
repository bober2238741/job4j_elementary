package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTestTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = ConverterTest.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = ConverterTest.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}