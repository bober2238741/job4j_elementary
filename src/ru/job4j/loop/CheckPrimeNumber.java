package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int x = 2; x < number; x++){
            if ((number % x) == 0) {
                prime = false;
                break;
            }
        }
        if (number < 2) {
            prime = false;

        }
        return prime;
    }
}
