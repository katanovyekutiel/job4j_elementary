package ru.job4j.ru.job4j.calculator.ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double c = Math.pow(double a);
        double d = Math.pow(double b);
        double e = c + d;
        double rsl = Math.sqrt(double e);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}