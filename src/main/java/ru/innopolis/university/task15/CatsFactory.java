package ru.innopolis.university.task15;

public class CatsFactory extends AnimalFactory{
    @Override
    public Animal create(int id, String nickname, Person person, double weight) {
        return new Cats(id, nickname, person, weight);
    }
}
