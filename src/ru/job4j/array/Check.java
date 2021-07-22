package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
            for (int index = 1; index < data.length; index++) {
                if (data[index] != data[0]) {
                    return false;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        boolean[] data = new boolean[] {false, true, false};
        System.out.println(Check.mono(data));
    }

}
