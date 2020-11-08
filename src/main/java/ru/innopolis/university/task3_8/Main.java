package ru.innopolis.university.task3_8;


public class Main{
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[(int) (Math.random() * 100)];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 100);
            System.out.println("Вычисляем факториал числа "+array[j]);
            NewThread thread = new NewThread(array[j]);
            thread.t1.start();
            thread.t2.start();
            thread.t1.join();
            thread.t2.join();
            thread.t3.start();
            thread.t3.join();
        }
    }
}
