package ru.innopolis.university.task3_5;

import java.util.*;

public class CardIndex {
    static Map<Integer, Animal> animals = new TreeMap<>();
    ArrayList<Animal> values = new ArrayList<Animal>(animals.values());

    public void addAnimal(Animal animal) throws Exception {

        animals.put(animal.id, animal);

    }

    public void search(String nick) {
        for (Animal animal : values) {
            if (nick.equals(animal.getNickname())) {
                System.out.println(animals.get(animal.getId()));
            }
        }
    }

    public void print() {
        if (animals != null) {
            System.out.println(animals.toString());
        }
    }

    public void cardNew(int id, String nick, Person person, double weigth) {
        animals.get(id).setNickname(nick);
        animals.get(id).setPerson(person);
        animals.get(id).setWeigth(weigth);
    }

    public void sort() {
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.size() - 1 - i; j++) {
                if ((values.get(j).getPerson().getName().compareTo(values.get(j + 1).getPerson().getName()) > 0 &&
                        values.get(j).getPerson().getSex() == values.get(j + 1).getPerson().getSex() &&
                        values.get(j).getPerson().getAge() == values.get(j + 1).getPerson().getAge()) ||
                        (values.get(j).getPerson().getSex() == Sex.WOMAN && values.get(j + 1).getPerson().getSex() == Sex.MAN) ||
                        (values.get(j).getPerson().getSex() == values.get(j + 1).getPerson().getSex() &&
                                values.get(j).getPerson().getAge() < values.get(j + 1).getPerson().getAge())) {
                    Animal temp = values.get(j);
                    values.set(j, values.get(j + 1));
                    values.set((j + 1), temp);
                }
            }
            System.out.println(values.get(i));
        }
        for(Animal animal: values){
            System.out.println(animal);
        }
    }
}