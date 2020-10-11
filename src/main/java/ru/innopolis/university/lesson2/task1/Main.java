package ru.innopolis.university.lesson2.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Object obj = null;
/*if(obj.equals("qu qu na"))
System.out.println("Hello world");*/
        int[] array = {3, 5, 2, -87, 92};
//array[6]=10;
        try{
            if(array[3]<0)
                throw new Exception ("Третий элемент массива меньше нуля");
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
