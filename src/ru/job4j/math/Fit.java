package ru.job4j.math;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height1) {
        return (height1 - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        System.out.println("Man 180 is " + man + " perfect weight.");

        short height1 = 170;
        double woman = Fit.womanWeight(height1);
        System.out.println("Woman 170 is " + woman + " perfect weight.");
    }
}