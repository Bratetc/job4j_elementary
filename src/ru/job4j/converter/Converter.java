package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value){
        //Необходимо изменить тип с int на double
        return value / 70;
    }

    public static int rubleToDollar(int value){
        //Необходимо изменить тип с int на double
        return value / 60;
    }

    public static void main(String[] args){
        int in = 140;
        double expected = 2;
        int out = rubleToEuro(140);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        expected = 2.33;
        out = Converter.rubleToDollar(140);
        passed = expected == out;
        System.out.println("140 rubles are 2.33 dollars. Test result : " + passed);
    }
}
