package ru.job4j;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int main(String[] args) {
        int max = Max.max(1, 2);
        System.out.println();
        return max;
    }
}
