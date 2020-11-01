package ru.innopolis.university.task3_7;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("File.txt"), StandardCharsets.UTF_8))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                strList.add(str);
            }
            Set<String> set = new HashSet<>(strList);
            strList.clear();
            strList.addAll(set);
            strList.sort(String::compareToIgnoreCase);
            System.out.println(strList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

