package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int diff = money - price;
        int size = 0;
        int[] rsl = new int[100];
        for (int coin : coins) {
            while (diff >= coin) {
                diff -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[]args) {
        System.out.println(Arrays.toString(Machine.change(100, 47)));
    }
}