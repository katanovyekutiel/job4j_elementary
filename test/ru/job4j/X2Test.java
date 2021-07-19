package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.X2;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected1 = 2;
        int rsl1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected1, rsl1);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected2 = 2;
        int rsl2 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected2, rsl2);
    }

    @Test
    public void whenA1B1C1X0Then2() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected3 = 1;
        int rsl3 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected3, rsl3);
    }
}