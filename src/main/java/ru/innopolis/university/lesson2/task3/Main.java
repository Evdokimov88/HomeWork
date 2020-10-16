package ru.innopolis.university.lesson2.task3;


public class Main {
    public static void main(String[] args) {


        Person[] person = new Person[10000];
        //присваиваем полям person значения
        for (int i = 0; i < person.length; i++) {
            person[i] = (new Person(((int) (100 * Math.random())), Sex.randomSex(), Person.createName(person.length)));
            System.out.println(person[i].toString());
        }
//Сортируем
        SortPerson sortPerson = new SortPerson();
        sortPerson.sort(person);
        System.out.println("===============Результат после сортировки===================");
        for (Person value : person)
            System.out.println(value.toString());
    }
}


