package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Andrey";
        names[1] = "Sergey";
        names[2] = "Lena";
        names[3] = "Stepan";
        String i = names[0];
        String he = names[1];
        String she = names[2];
        String he1= names[3];
        System.out.println(i + " " + he + " " + she + " " + he1);
        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3]); // по индексу.
    }

}
