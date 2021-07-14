package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
        public void whenConvert180RblThen3Dlr() {
        float in1 = 180;
        float expected1 = 3;
        float out1 = Converter.rubleToDollar(in1);
        float eps1 = 0.0001f;
        Assert.assertEquals(expected1, out1, eps1);
    }
}