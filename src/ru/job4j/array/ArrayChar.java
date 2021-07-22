package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            for (int index1 = 0; index1 < pref.length; index1++) {
                if (word[index] != pref[index1]) {
                    return false;
                }
                if (word[index] == pref[index1]) {
                    return true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        System.out.println(ArrayChar.startsWith(word, pref));
    }
}
