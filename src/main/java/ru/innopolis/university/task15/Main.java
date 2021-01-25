package ru.innopolis.university.task15;

/**
 * 1) Применить один из порождающих паттернов для приложения с занятий по JavaEE.
 * 2) Объяснить смысл применения паттерна в конкретном случае.
 * Взял за основу ДЗ_5:
 * Разработать программу – картотеку домашних животных. У каждого животного есть уникальный идентификационный номер, кличка, хозяин (объект класс Person с полями – имя, возраст, пол), вес.
 * <p>
 * Реализовать:
 * <p>
 * метод добавления животного в общий список (учесть, что добавление дубликатов должно приводить к исключительной ситуации)
 * поиск животного по его кличке (поиск должен быть эффективным)
 * изменение данных животного по его идентификатору
 * вывод на экран списка животных в отсортированном порядке. Поля для сортировки –  хозяин, кличка животного, вес.
 *
 * Применил паттерн "Абстрактная фабрика" (класс AnimalFactory)
 * Благодаря этоу упростил создание обьектов и снизил связанность кода
 */


public class Main {
    public static void main(String[] args) throws Exception {
        Person Svetlana = new Person(18, Sex.WOMAN, "Svetlana");
        Person Andrey = new Person(39, Sex.MAN, "Andrey");
        Person Irina = new Person(56, Sex.WOMAN, "Irina");
        Person Oleg = new Person(18, Sex.MAN, "Oleg");
        Person Olga = new Person(40, Sex.WOMAN, "Olga");


        AnimalFactory factory = new CatsFactory();
        Animal catBarsik = factory.create(1, "Barsik", Svetlana, 5);
        Animal catVaska = factory.create(10, "Vaska", Andrey, 4.4);
        factory = new DogsFactory();
        Animal dogTuzik = factory.create(4, "Tuzik", Oleg, 7.6);
        Animal dogSharik = factory.create(6, "Sharik", Irina, 13.7);

        CardIndex cardIndex = new CardIndex();
        cardIndex.addAnimal(catBarsik);
        cardIndex.addAnimal(dogTuzik);
        cardIndex.addAnimal(catVaska);
        cardIndex.addAnimal(dogSharik);
        cardIndex.print();
        cardIndex.search("Sharik");

        cardIndex.cardNew(4, "Bobik", Olga, 14);
        cardIndex.print();

        cardIndex.sort();


    }
}
