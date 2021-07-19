package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.SqArea;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K3Square229() {
        double expected1 = 2.29;
        int p = 7;
        double k = 3;
        double out1 = SqArea.square(p, k);
        Assert.assertEquals(expected1, out1, 0.01);
    }

    @Test
    public void whenP8K4Square229() {
        double expected2 = 2.56;
        int p = 8;
        double k = 4;
        double out2 = SqArea.square(p, k);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}