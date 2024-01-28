package org.example;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner inputNumbers = new Scanner(System.in);
        int numbersFibonachi = inputNumbers.nextInt();
        int tmpVariable = 0;
        int startItteration = 1;

        for (int i = 2; i <= numbersFibonachi; ++i) {

            int newVariable = tmpVariable + startItteration;
            tmpVariable = startItteration;
            startItteration = newVariable;
            System.out.print(" > " + startItteration);
        }
        System.out.println();
        System.out.println("Число Фібоначі від введено числа " + numbersFibonachi + " складає " + startItteration);

    }
}

//Завдання 9
//        Знайдіть послідовність Фібоначчі.
//        Одне стартове число користувач вводить,
//        друге вводить користувач до шуканого.


