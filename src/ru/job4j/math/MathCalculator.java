package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumAndMultiplyAndDifferenceAndDivision(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат рфсчетов: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы: разностя и деления: "
                + differenceAndDivision(10, 20));
        System.out.println("Результат суммы всех четырех операций: "
                + sumAndMultiplyAndDifferenceAndDivision(10, 20));
    }
}
