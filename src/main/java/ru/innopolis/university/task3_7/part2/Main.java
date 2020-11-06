package ru.innopolis.university.task3_7.part2;
/*
Задание 2. Создать генератор текстовых файлов, работающий по следующим правилам:

        Предложение состоит из 1<=n1<=15 слов. В предложении после произвольных слов могут находиться запятые.
        Слово состоит из 1<=n2<=15 латинских букв
        Слова разделены одним пробелом
        Предложение начинается с заглавной буквы
        Предложение заканчивается (.|!|?)+" "
        Текст состоит из абзацев. в одном абзаце 1<=n3<=20 предложений. В конце абзаца стоит разрыв строки и перенос каретки.
        Есть массив слов 1<=n4<=1000. Есть вероятность probability вхождения одного из слов этого массива в следующее предложение (1/probability).
        Необходимо написать метод getFiles(String path, int n, int size, String[] words, int probability), который создаст n файлов размером size в каталоге path. words - массив слов, probability - вероятность.
*/





import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println(textAdd());
        getFiles("c://USERS//Olga//dir", 10, 1024, TextGeneration.words(), 9);
    }

//добавляем слова слова в список
    public static List<String> wordsAdd() {
        List<String> wordList = new ArrayList<>();
        for (int i=0; i<((int)(Math.random()*15)); i++){
            wordList.add(i, TextGeneration.wordGen());
        }
        return wordList;
    }
//собираем список из слов( добавляем первое слово, другие слова(от 0 до 15) и знак пуктуации)
    public static List<String> sentenceAdd() {
        List<String> sentenceList = new ArrayList<>();
        for (int i = 0; i < (1 + (int) (Math.random() * 20)); i++) {
            sentenceList.add(i, TextGeneration.sentenceGen(TextGeneration.firsWordGen(), wordsAdd(), TextGeneration.markGen()));
        }
        return sentenceList;
    }

//собираем список из предложений
    public static List<String> paragraphAdd() {
        List<String> paragList = new ArrayList<>();
        for (int i = 0; i < (1 + (int) (Math.random() * 20)); i++) {
            paragList.add(i, TextGeneration.paragrapfGen(sentenceAdd()));
        }
        return paragList;
    }
//собираем список из абзацев
    public static String textAdd() {
        List<String> textList = new ArrayList<>();
        for (int i = 0; i < (1 + (int) (Math.random() * 30)); i++) {
            textList.add(i, TextGeneration.textGen(paragraphAdd()));
        }
        return textList.toString();
    }
//создаем n файлов и записываем туда текст
    public static void getFiles(String path, int n, int size, String[] words, int probability) throws IOException {
        File dir = new File(path);
        dir.mkdir();
        RandomAccessFile[] file = new RandomAccessFile[n];
        for (int i = 1; i < file.length; i++) {
            file[i] = new RandomAccessFile(path + "//file" + i + ".txt", "rw");
            file[i].setLength(size);
            file[i].write(textAdd().getBytes());
        }
    }
}


