package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = {5, 4, 3, 2};
        int el = 6;
        System.out.println(FindLoop.indexOf(data, el));
    }
}
