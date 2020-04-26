package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c){
        double p = (a + b + c) / 2; // Полупериметр
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args){
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("The area of a triangle with sides 2, 2, 2 is equal to " + rsl);
    }
}
