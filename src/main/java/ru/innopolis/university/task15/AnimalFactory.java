package ru.innopolis.university.task15;

public abstract class AnimalFactory{
    public abstract Animal create(int id, String nickname, Person person, double weight);
}
