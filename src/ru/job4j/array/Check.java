package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
            for (int index = 0; index < data.length - 1; index++) {
                if (data[index] == false) {
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
