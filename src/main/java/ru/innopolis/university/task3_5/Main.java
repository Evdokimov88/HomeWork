package ru.innopolis.university.task3_5;



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
        CardIndex cardIndex = new CardIndex();

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
