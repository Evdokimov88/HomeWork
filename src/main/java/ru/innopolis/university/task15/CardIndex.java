package ru.innopolis.university.task15;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CardIndex {
    static Map<String, Animal> animals = new HashMap<>();
    ArrayList<Animal> values = new ArrayList<>(animals.values());

    public void addAnimal(Animal animal) {

        animals.put(animal.getNickname(), animal);

    }

    public void search(String nick) {
        if (animals.containsKey(nick)) {
            System.out.println("Животное с такой кличкой имеется: \n" + animals.get(nick));
        } else {
            System.out.println("Животного с такой кличкой нет");
        }
    }


    public void print() {
        if (!animals.isEmpty()) {
            System.out.println(animals.toString());
        } else if (animals.isEmpty()) System.out.println("Картотека пуста");
    }

    public void cardNew(int id, String nick, Person person, double weigth) {
        Set<Map.Entry<String, Animal>> tempMap = animals.entrySet();
        Animal newAnimal = new Animal(id, nick, person, weigth);
        for (Map.Entry<String, Animal> value : tempMap) {
            if (id == value.getValue().getId()) {
                value.setValue(newAnimal);
                animals.put(value.getKey(), newAnimal);
            }
        }

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
        for (Animal animal : values) {
            System.out.println(animal);
        }
    }
}