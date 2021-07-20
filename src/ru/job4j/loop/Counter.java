package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (sum = start; sum <= finish; sum++) {
            sum = ((finish * finish) - (start * start) + start + finish) / 2; //  я не могу понять, как сложить все числа внутри цикла
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (sum = start; sum <= finish; sum++) {
            if (sum % 2 == 0) {
                sum = ((finish * finish) - (start * start) + start + finish) / 2; //  я не могу понять, как сложить все числа внутри цикла
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
