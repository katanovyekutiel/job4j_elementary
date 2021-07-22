package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class PrintEvenElementsTest {

    @Test
    public void whenPrintEvenElements() {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] result = PrintEvenElements.main(numbers);
        int[] expected = new int[] {14, 12, 10, 8, 6, 4, 2};
        Assert.assertArrayEquals(expected, result);
    }
}