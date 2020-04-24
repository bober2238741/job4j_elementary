package ru.job4j.loop;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int out = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int out = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }


}