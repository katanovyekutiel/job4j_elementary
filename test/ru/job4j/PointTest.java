package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20then0() {
        double expected1 = 0;
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out1 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected1, out1, 0.01);
    }

    @Test
    public void when02to00then2() {
        double expected2 = 2;
        int x1 = 2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out2 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected2, out2, 0.01);
    }

    @Test
    public void when11to20then141() {
        double expected3 = 1.41;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        double out3 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected3, out3, 0.01);
    }
}