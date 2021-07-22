package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
           }
           if (array[i] > min) {
               return min;
           }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {10, 5, 3};
        System.out.println(Min.findMin(array));
    }
}
