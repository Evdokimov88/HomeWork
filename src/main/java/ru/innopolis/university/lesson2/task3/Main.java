package ru.innopolis.university.lesson2.task3;

import java.util.*;

class Person {
    int age;
    Sex sex;
    String name;

    Person(int age, Sex sex, String name) {
        this.age = age;
        this.name = name;
        this.sex = sex;

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}

enum Sex {
    MAN,
    WOMAN;

//Создаем из перечеслений неизменяемый список
    private static final List<Sex> value =
            Collections.unmodifiableList(Arrays.asList(values()));

    private static final Random random = new Random();
//Выбираем случайный элемент списка
    public static Sex randomSex() {
        return value.get(random.nextInt(value.size()));
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[10000];
        List<Integer> personList = new ArrayList<Integer>();
        int[] age = new int[person.length];
        for (int i = 0; i < person.length; i++) {

            String alfabet = "ABCDE";
            StringBuilder name = new StringBuilder(5);/*Создаем обьект имя,
            который будет состоять из символов alfabet*/

            for (int k = 0; k < 5; k++) {
                /*Ниже выдергиваем символ из alfabet псевдослучайным образом
                и добавляем его в наше имя*/
                int index = (int) (alfabet.length() * Math.random());
                name.append(alfabet.charAt(index));
            }
            //присваиваем полям person значения
            person[i] = new Person(((int) (100 * Math.random())), Sex.randomSex(), name.toString());
            System.out.println(person[i].toString());


        }
        arraysorted(age);
for(int i = 0; i<person.length; i++)

            System.out.println(age);

        }
    private static void arraysorted(int[] mas){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
    }

    }


class ArrayBubble{




}