package ru.job4j.converter;

public class ConverterTest {

    public static int rubleToEuro(int value) {
        return value / 70;
    }


    public static int rubleToDollar(int value) {
        return -1;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int dollar = rubleToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollar.");
        int in1 = 200;
        int expect1 = 3;
        int out1 = rubleToDollar(in1);
        boolean passed2 = expect1 == out1;
        System.out.println("200 rubles are 3. Test result :" + passed2);
    }
}
