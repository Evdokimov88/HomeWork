package ru.innopolis.university.task16;

/**
 * 1) Применить один из структурных паттернов для приложения с занятий по JavaEE.
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
 * Применил паттерн "Адаптер" (класс HomePlantsAdapter)
 * Благодаря применению данного паттерна, в картотеку появилась возможность добавлять не только животных, но и как
 * в данном примере домашние растения.
 */

public class Main {
    public static void main(String[] args) throws Exception {
      Person Svetlana = new Person(18, Sex.WOMAN, "Svetlana");
        Person Andrey = new Person(39, Sex.MAN, "Andrey");
        Person Irina = new Person(56, Sex.WOMAN, "Irina");
        Person Oleg = new Person(18, Sex.MAN, "Oleg");
        Person Svetlana1 = new Person(30, Sex.WOMAN, "Svetlana");
        Person Pavel = new Person(22, Sex.MAN, "Pavel");
        Person Olga = new Person(40, Sex.WOMAN, "Olga");
        Person Yulia = new Person(27, Sex.WOMAN, "Yulia");
        Person Roman = new Person(22, Sex.MAN, "Roman");

        Animal catBarsik = new Animal(1, "Barsik", Svetlana, 3.5);
        Animal dogTuzik = new Animal(2, "Tuzik", Svetlana1, 10);
        Animal catVaska = new Animal(3, "Vaska", Andrey, 4);
        Animal parrot = new Animal(4, "Kuzya", Irina, 0.5);
        Animal dogSharik = new Animal(5, "Sharik", Oleg, 8);
        Animal lionSimba = new Animal(6, "Simba", Pavel, 40);
        Animal catGav = new Animal(7, "Gav", Olga, 2.7);
        Animal dogPolkan = new Animal(8, "Polkan", Yulia, 12);
        Animal hamster = new Animal(9, "PiPi", Roman, 0.3);
        Animal catTishka = new Animal(10, "Tishka", Yulia, 3);
        Animal enot = new Animal(11, "Enot", Irina, 0.7);
        Animal snake = new Animal(12, "Snake", Pavel, 1);

        HomePlants ficus = new HomePlants(13, "Ficus", Irina, 2);
        HomePlants aloeVera = new HomePlants(14, "Aloe Vera", Yulia, 5);

        HomePlantsAdapter ficusAdapter = new HomePlantsAdapter(ficus);
        HomePlantsAdapter aloeAdapter = new HomePlantsAdapter(aloeVera);

        CardIndex cardIndex = new CardIndex();
        cardIndex.addAnimal(ficusAdapter);
        cardIndex.addAnimal(aloeAdapter);

        cardIndex.addAnimal(catBarsik);
        cardIndex.addAnimal(dogTuzik);
        cardIndex.addAnimal(catVaska);
        cardIndex.addAnimal(parrot);
        cardIndex.addAnimal(dogSharik);
        cardIndex.addAnimal(lionSimba);
        cardIndex.addAnimal(catGav);
        cardIndex.addAnimal(dogPolkan);
        cardIndex.addAnimal(hamster);
        cardIndex.addAnimal(catTishka);
        cardIndex.addAnimal(enot);
        cardIndex.addAnimal(snake);



        cardIndex.print();
        cardIndex.search("Sharik");

        cardIndex.cardNew(4, "Bobik", Olga, 14);
        cardIndex.print();

        //cardIndex.sort();


    }
}
