package ru.innopolis.university.lesson2.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NegativeNumberException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество случайных чисел N");
        int n = scan.nextInt();
        isSqrQisK(n);
    }

    private static void isSqrQisK(int n) throws NegativeNumberException {
        Random r = new Random();
        for (int i = 0; i <= n; i++) {
            int k = r.nextInt();
            if (k >= 0) {
                Double q = Math.sqrt(k);
                int qtemp = q.intValue();
                if (Math.pow(qtemp, 2) == k) {
                    System.out.print(k + " ");
                }
            } else {
                throw new NegativeNumberException(k);
            }
            System.out.println(k);
        }
    }
}



