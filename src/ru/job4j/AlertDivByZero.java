package ru.job4j;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("This is negative numbers");
        }
    }
}
