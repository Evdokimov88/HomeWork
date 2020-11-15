package ru.innopolis.university.task3_10;


import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.util.Scanner;

public class Loader extends ClassLoader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String head = "package ru.innopolis.university.task3_10;\n" +
                "public class SomeClass implements Worker{\n" +
                "    @Override\n" +
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
      //  JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
       // compiler.run(null, null, null, "SomeClass.java");
       // final Class someClass = loadSimpleClass();
        Process p1 = Runtime.getRuntime().exec("javac",null, new File("C:\\Users\\Olga\\IdeaProjects\\HomeWork\\SomeClass"));
    }


    private static Class loadSimpleClass() throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader();
        final Class<?> someClass = Class.forName("SomeClass", true,myClassLoader);

        System.out.println(someClass);

        System.out.println("Класслоадер работает " +
                (Class.forName("SomeClass", true, myClassLoader).equals(someClass) ?
                        "ВЕРНО" :
                        "НЕВЕРНО"));

        return someClass;
    }
}




