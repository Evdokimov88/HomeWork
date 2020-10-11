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

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
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

        int index;
        Person temp;
        for (int a = 0; a < person.length - 1; a++) {
            index = a;
            for (int b = a + 1; b < person.length; b++)
                if (person[b].getAge() > person[index].getAge())
                    index = b;
            temp = person[a];
            person[a] = person[index];
            person[index] = temp;

        }
        for (Person value : person)
            System.out.println(value.toString());
    }
}

