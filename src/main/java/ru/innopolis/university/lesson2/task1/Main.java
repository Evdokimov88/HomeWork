package ru.innopolis.university.lesson2.task1;

public class Main {
    /*
Задание 1. Написать программу ”Hello, World!”.
В ходе выполнения программы она должна выбросить исключение и завершиться с ошибкой.

Смоделировав ошибку «NullPointerException»
Смоделировав ошибку «ArrayIndexOutOfBoundsException»
Вызвав свой вариант ошибки через оператор throw
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        Object obj = null;
        int[] array = {3, 5, 2, -87, 92};
        NPE(obj);
        AIOofBE(array);
        try {
            if (array[3] < 0)
                throw new Exception("Третий элемент массива меньше нуля");
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    private static void NPE(Object obj) {
        obj.equals("qu qu na");
        System.out.println("Hello world");
    }

    private static void AIOofBE(int[] array) {
        array[6] = 10;
    }

}
