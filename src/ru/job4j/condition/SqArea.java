package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = Math.pow(p / (2 * (k + 1)), 2) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("The area of a rectangle with a perimeter p = 6 and the coefficient k = 2 is equal to " + result1);
    }
}
