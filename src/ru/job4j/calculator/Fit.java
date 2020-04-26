package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height){
        //Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(double height){
        //Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args){
        double man = Fit.manWeight(100);
        double woman = Fit.womanWeight(100);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 100 is " + woman);
    }
}
