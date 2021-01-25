package ru.innopolis.university.task15;

public class DogsFactory extends AnimalFactory{
    @Override
    public Animal create(int id, String nickname, Person person, double weight) {
        return new Dogs(id, nickname, person, weight);
    }
}
