package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int diff = money - price;
        int size = 0;
        int[] rsl = new int[100];
        for (int i = 0; i < coins.length; i++) {
            while (diff >= coins[i]) {
                diff -= coins[i];
                rsl[size++] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, diff);
    }

    public static void main(String[]args) {
        System.out.println(Arrays.toString(Machine.change(100, 47)));
    }
}