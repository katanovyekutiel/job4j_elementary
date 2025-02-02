package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.Fit;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected1 = 69;
        double out1 = Fit.womanWeight(in);
        Assert.assertEquals(expected1, out1, 0.01);
    }
}