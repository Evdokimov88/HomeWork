package ru.innopolis.university.task3_8;

import java.math.BigInteger;

public class NewThread{
    private final String name;
    Thread thread;

    BigInteger fact1;
    BigInteger fact2;
    int[] array = new int[(int) (Math.random() * 100)];

    public NewThread(String name) {
        this.name = name;
        System.out.println("New thread " + thread);
    }

    public int array() {
        int arra = 0;
        for (int j = 0; j < this.array.length; j++) {
            this.array[j] = (int) (Math.random() * 1000);
            arra = this.array[j];
        }
        return arra;
    }

    Thread t1 = new Thread("t1") {
        @Override
        public void run() {
            System.out.println("Running t1");

            BigInteger fact = BigInteger.valueOf(1);
            for (int i = 2; i <= array(); i += 2) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
            fact1 = fact;

        }
    };
    Thread t2 = new Thread("t2") {
        @Override
        public void run() {
            System.out.println("Running t2 ");
            BigInteger fact = BigInteger.valueOf(1);
            for (int i = 3; i <= array(); i += 2) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
            fact2 = fact;
        }

    };
    Thread t3 = new Thread("t3") {
        public void run() {
            BigInteger res;
            System.out.println("Running t3 ");
            res = fact1.multiply(fact2);
            System.out.println(res);
        }

    };

}
