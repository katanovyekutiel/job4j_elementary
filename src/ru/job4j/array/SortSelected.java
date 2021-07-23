package ru.job4j.array;

public class SortSelected {
    public static int sort(int[] data) {
//        for (...) {
//            int min = MinDiapason.findMin(data, 0, data.length);
//            int index = FindLoop.indexOf(data, min, 0, data.length);
//            /* swap(...) */
//        }

        for (int in = 0; in < data.length; in++) {
            int min = data[in];
            int mini = in;
            for (int i = 1; i < data.length; i++) {
                if (data[i] < min) {
                    min = data[i];
                    data[0] = min;
                }
                if (i != mini) {
                    int tmp = data[i];
                    data[i] = data[mini];
                    data[mini] = tmp;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 4, 1, 2, 5};
        System.out.println(SortSelected.sort(data));
    }
}
