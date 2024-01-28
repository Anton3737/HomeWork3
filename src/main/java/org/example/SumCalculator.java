package org.example;

public class SumCalculator {

    public int sumRangeOfNumbers(int n) {

        int number = 0;
        if (n <= 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i <= n; i++) {
                number += i;
            }

            System.out.println("Сума чисел від 1 до " + n + " становить = " + number);
            return number;
        }
    }

}
