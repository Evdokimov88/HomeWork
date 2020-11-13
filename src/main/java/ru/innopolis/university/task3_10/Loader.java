package ru.innopolis.university.task3_10;

import java.io.*;
import java.util.Scanner;

public class Loader extends ClassLoader{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Введите код для выполнения");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        File file = new File("SomeClass.java");
        file.createNewFile();
        try (FileOutputStream fos = new FileOutputStream("SomeClass.java")) {
            while (scanner.hasNext()) {
                fos.write((scanner.nextLine()).getBytes());
                if ((scanner.nextLine()).equals(""))
                    break;
            }
        }
        final Class simpleClass = loadSimpleClass();
    }


    private static Class loadSimpleClass() throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader();

        final Class<?> simpleClass = Class.forName("SomeClass", true, myClassLoader);

        System.out.println(simpleClass);

        System.out.println("Класслоадер работает " +
                (Class.forName("Simple", true, myClassLoader).equals(simpleClass) ?
                        "ВЕРНО" :
                        "НЕВЕРНО"));

        return simpleClass;
    }
}


//package ru.innopolis.university.task3_10;
//
//public class SomeClass implements Worker{
//    @Override
//    public void doWork() {
//
//    }
//}



