package ru.innopolis.university.lesson2.task2;

import java.util.Random;
import java.util.Scanner;

class NegativeNumberException extends Exception {
            private double value;


            NegativeNumberException(double value) {
                this.value = value;
            }

            // переопределенный метод toString() класса Throwable,
// этот метод выводит информацию об исключении типа NegativeNumberException
            public String toString() {
                String msg = "Exception: " + value + " is a negative number!!!";
                return msg;
            }
        }

        public class Main {
            public static void main(String args[]) throws NegativeNumberException {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите количество случайных чисел N");
                int n = scan.nextInt();
                Random r = new Random();
                for (int i=0; i<=n; i++){
                    int k = r.nextInt();
                   // System.out.print(k+" ");
                 //   System.out.println();
                    if (k>=0) {
                        Double q = Math.sqrt(k);
                       // System.out.print(q + " ");
                        int _q = q.intValue();
                        if(Math.pow(_q, 2)==k){
                            System.out.print(k+" ");
                        }
                    }
                    System.out.println();
                        if(k<0) throw new NegativeNumberException(k);
                             System.out.print(k);
                    }


                }
            }



