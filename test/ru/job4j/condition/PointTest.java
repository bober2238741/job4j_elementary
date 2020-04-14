package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int in = 2;            // Тут вместо double написал int - так как в аргументах у нас переменная int.
        double expected = 2;
        double out = Point.distance(0,0, in,0);    // Добавил сюда int in - так как не понимаю , как записать 4 переменные - это правильно ?
        Assert.assertEquals(expected, out, 0.01);
    }
}