package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
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
