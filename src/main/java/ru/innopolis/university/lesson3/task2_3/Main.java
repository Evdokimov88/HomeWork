package ru.innopolis.university.lesson3.task2_3;

/*Задание 1. Написать класс MathBox, реализующий следующий функционал:

Конструктор на вход получает массив Number. Элементы не могут повторяться. Элементы массива внутри объекта
раскладываются в подходящую коллекцию (выбрать самостоятельно).
Существует метод summator, возвращающий сумму всех элементов коллекции.
Существует метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель, являющийся
 аргументом метода. Хранящиеся в объекте данные полностью заменяются результатами деления.
Необходимо правильно переопределить методы toString, hashCode, equals, чтобы можно было использовать MathBox для вывода
 данных на экран и хранение объектов этого класса в коллекциях (например, hashMap). Выполнение контракта обязательно!
Создать метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его.*/

public class Main {

    public static void main(String[] args) throws Exception {
        Number[] number = {160, 2.333f, 62.23, 56.0f, 10930244088L, 120478, 100};
        Number[] number1 = {160, 2.333f, 62.23, 56.0f, 10930244088L, 120478, 100};
        MathBox<Number> mathBox = new MathBox<>(number);
        MathBox<Number> mathBox1 = new MathBox<>(number1);
        System.out.println(mathBox.equals(mathBox1));
        System.out.println(mathBox.toString());
        System.out.println(mathBox.hashCode());

        System.out.println("Сумматор: ");
        System.out.println(mathBox.summator());
        System.out.println(mathBox.toString());
        System.out.println(mathBox.hashCode());
        System.out.println("Сплиттер: ");
        mathBox.splitter(10);
        System.out.println(mathBox.toString());
        System.out.println(mathBox.hashCode());
        System.out.println("Delete Integer: ");
        mathBox.delInteger(16);
        System.out.println(mathBox.toString());
        System.out.println(mathBox.hashCode());

        ObjectBox objectBox = new ObjectBox();
        Object obj = new Object();
        Object job = new Object();
        Object superObj = new Object();
        Object megaObj = new Object();
        Object objObj = new Object();
        Object ququna = new Object();

        objectBox.addObject(obj);
        objectBox.addObject(job);
        objectBox.addObject(superObj);
        objectBox.addObject(megaObj);
        objectBox.addObject(objObj);
        objectBox.addObject(ququna);
        System.out.println();
        objectBox.dump();
        objectBox.deleteObject(megaObj);
        objectBox.dump();
        System.out.println();

        mathBox.addObject(12);
        mathBox.addObject(2);
        mathBox.dump();

    }

}


