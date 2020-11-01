package ru.innopolis.university.task3_7.part2;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        List<String> sentenceList = new ArrayList<>();
        List<String> paragList = new ArrayList<>();
        for (int i=0; i<((int)(Math.random()*15)); i++){
            wordList.add(i, TextGeneration.wordGen());
        }
        for (int i=0; i<(1+(int)(Math.random()*20)); i++){
            sentenceList.add(i,TextGeneration.sentenceGen(TextGeneration.firsWordGen(), wordList,TextGeneration.markGen()));
        }
        String paragrapg = TextGeneration.paragrapfGen(sentenceList);
        System.out.println(paragrapg);
    }
}
