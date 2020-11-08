package ru.innopolis.university.task3_8;


public class Main{
    public static void main(String[] args) throws InterruptedException {
     NewThread thread  = new NewThread("main");
     thread.t1.start();
        thread.t2.start();
        thread.t1.join();
        thread.t2.join();
        thread.t3.start();
    }
}
