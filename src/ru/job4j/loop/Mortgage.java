package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        for (year = 1; salary <= amount * percent; year++) {
          amount = (amount * percent) - salary;
          year++;
            if (amount * percent <= salary) {
                break;
            }
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(1000, 1200, 1));
        System.out.println(year(100, 120, 50));
    }
}
