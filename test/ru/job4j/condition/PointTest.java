package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int inx1 = 0;
        int iny1 = 0;
        int inx2 = 2;
        int iny2 = 0;
        double expected = 2;
        double out = Point.distance(inx1, iny1, inx2, iny2);    //  Добавил сюда int in - так как не понимаю , как записать 4 переменные - это правильно ?
        Assert.assertEquals(expected, out, 0.01);
    }
}