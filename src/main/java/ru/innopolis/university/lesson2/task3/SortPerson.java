package ru.innopolis.university.lesson2.task3;

public class SortPerson implements Sort{

    @Override
        public Person[] sort(Person[] person){
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if ((person[j].getName().compareTo(person[j + 1].getName()) > 0 &&
                        person[j].getSex() == person[j + 1].getSex() &&
                        person[j].getAge() == person[j + 1].getAge()) ||
                        (person[j].getSex() == Sex.WOMAN && person[j + 1].getSex() == Sex.MAN) ||
                        (person[j].getSex() == person[j + 1].getSex() &&
                                person[j].getAge() < person[j + 1].getAge())) {
                   Person temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }

        return person;
    }
}
