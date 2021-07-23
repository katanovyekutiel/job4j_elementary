package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        System.out.println(MinDiapason.findMin(array, start, finish));
    }
}
