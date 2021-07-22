package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        if (left.length != right.length) {
            return false;
        }
        if (left.length == right.length) {
            return true;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        System.out.println(EqLast.check(left, right));
    }
}
