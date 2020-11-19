package ru.innopolis.university.task3_10;


import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Loader extends ClassLoader {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException,
            IllegalAccessException, InstantiationException {
//Создаем SomeClass.java
        createSomeClass();
//Компилируем в SomeClass.class
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, "SomeClass.java");
        final Class someClass = loadSimpleClass();
        analizeClass(someClass);
    }


    /**
     * Данный метод создает файл SomeClass.java и записывает в него логику метода doWork();
     *
     * @throws IOException
     */
    public static void createSomeClass() throws IOException {

        String head = "public class SomeClass{\n" +
                "    public void doWork() {";

        System.out.println("Введите код для выполнения");
        Scanner scanner = new Scanner(System.in);
        File file = new File("SomeClass.java");
        file.createNewFile();
        try (FileOutputStream fos =
                     new FileOutputStream("SomeClass.java")) {
            while (scanner.hasNext()) {
                fos.write((head + scanner.nextLine() + "} }").getBytes());
                if ((scanner.nextLine()).equals(""))
                    break;
            }
        }
    }

    /**
     * Метод анализирует методы в загруженном SomeClass.class
     *
     * @param clazz
     */
    private static void analizeClass(Class clazz) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        System.out.println("Описанные в классе методы");

        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            System.out.println("Имя метода: " + declaredMethod.getName());
            System.out.println("Тип результата: " + declaredMethod.getReturnType());
            System.out.println("Выполняем метод " + declaredMethod.getName());
            declaredMethod.invoke(clazz.newInstance());
        }
    }

    /**
     * Метод загружает класс SomeClass с помощью myClassLoader
     *
     * @return
     * @throws ClassNotFoundException
     */
    private static Class loadSimpleClass() throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> someClass = Class.forName("SomeClass", true, myClassLoader);
        System.out.println(someClass);

        System.out.println("Класслоадер работает " +
                (Class.forName("SomeClass", true, myClassLoader).equals(someClass) ?
                        "ВЕРНО" :
                        "НЕВЕРНО"));
        return someClass;
    }
}




