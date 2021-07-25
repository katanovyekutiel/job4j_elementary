package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = money - price;
        int[] rsl = new int[100];
        for (int i = 0; i < coins.length; i++) {
            while (size > 0 && size >= coins[i]) {
                size = size - coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[]args) {
        System.out.println(Arrays.toString(Machine.change(100, 47)));
    }
}