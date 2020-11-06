package ru.innopolis.university.task3_7.part2;

import java.util.List;
import java.util.Random;

public class TextGeneration {
    static String alfabet = "abcdefghijklmnopqsrtuvwxyz";
    static String alfaUp = alfabet.toUpperCase();
    static String znaki = ".!?";
    static String space = " ";
//генерим первое слово с заглавной буква
    public static String firsWordGen() {
        Random random = new Random();
        char[] str = new char[15];
        char c = alfaUp.charAt(random.nextInt(alfaUp.length()));
        str[0] = c;
        for (int i = 1; i <= (((int) (Math.random() * 15))); i++) {
            str[i] = alfabet.charAt(random.nextInt(alfabet.length()));
        }
        return new String(str);
    }
//генерим слово
    public static String wordGen() {
        Random random = new Random();
        char[] str = new char[15];
        for (int i = 0; i <= (((int) (Math.random() * 15))); i++) {
            str[i] = alfabet.charAt(random.nextInt(alfabet.length()));
        }
        return new String(str);
    }
//генерим знак припянания
    public static String markGen() {
        int index = (int) (Math.random() * 3);
        return String.valueOf(znaki.charAt(index));
    }
//генерим предложение
    public static String sentenceGen(String fisrtWord, List<String> wordList, String mark) {
        StringBuilder sentence = new StringBuilder();

        for (int i = 0; i < wordList.size(); i++) {
            if (i < (wordList.size() - 1)) {
                sentence.append(wordList.get(i)).append(space);
            } else {
                sentence.append(wordList.get(i));
            }

        }
        return fisrtWord + " " + sentence + mark + " ";
    }
//генерим абзац
    public static String paragrapfGen(List<String> sentence) {
        StringBuilder para = new StringBuilder();
        for (String s : sentence) {
            para.append(s);
        }
        return para.toString();
    }
//генерим текст
    public static String textGen(List<String> paragrapg) {
        StringBuilder text = new StringBuilder();
        for (String s : paragrapg) {
            text.append(s).append("\r\n");
        }
        return text.toString();
    }
//генерим массив слов от 0 до 1000
    public static String[] words() {
        String[] words = new String[(int)(1+(Math.random() * 1000))];
        for (int i=0; i<words.length;i++){
            words[i]=wordGen();
        }
        return words;
    }

}
