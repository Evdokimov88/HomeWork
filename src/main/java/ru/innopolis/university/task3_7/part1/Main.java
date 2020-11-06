package ru.innopolis.university.task3_7.part1;

/*Задание 1. Написать программу, читающую текстовый файл.
        Программа должна составлять отсортированный по алфавиту список слов,
        найденных в файле и сохранять его в файл-результат. Найденные слова не должны повторяться,
        регистр не должен учитываться. Одно слово в разных падежах – это разные слова.*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(String::compareToIgnoreCase);
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("File.txt"), StandardCharsets.UTF_8))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                set.add(str);
            }
            System.out.println(set);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

