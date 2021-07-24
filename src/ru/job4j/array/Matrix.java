package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int i = 0;
        int j = 0;
        int array[][] = new int [size][size];
        for (i = 0; i <= size; i++) {
            for (j = 0; j <= size; j++) {
            } array[i][j] = i * j;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Matrix.multiple(3)));
    }
}
