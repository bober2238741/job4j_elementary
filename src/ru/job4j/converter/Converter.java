package ru.job4j.converter;

/**
 *Class Converter для вычисления арифметических операций.
 * @author AndreyKlevchenkov
 * @since 30.04.2020
 * @version 1.0
 */
public class Converter {
    /**
     * Method rubleToEuro.
     * @param value
     * @return rsl
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Method rubleToDollar.
     * @param value
     * @return rsl
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main.
     * @param args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar");
    }
}