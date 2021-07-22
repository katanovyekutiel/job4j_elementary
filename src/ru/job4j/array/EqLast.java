package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int index = 0; index < left.length; index++) {
        }
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        System.out.println(EqLast.check(left, right));
    }
}
