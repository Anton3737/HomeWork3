package org.example;

public class SumCalculator {

    public int fibonachiSum(int N) {

        int number = 0;
        if (N <= 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i <= N; i++) {
                number += i;
            }

            System.out.println("Сумма чисел " + N + " становить " + number);
            return number;
        }
    }

}
