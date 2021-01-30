package ru.innopolis.university.task17;

/**
 * 1) Применить один из поведенческих паттернов для приложения с занятий по JavaEE.
 *
 * 2) Объяснить смысл применения паттерна в конкретном случае.
 *
 * За основу взял ДЗ_3. Написать класс MathBox, реализующий следующий функционал:
*Конструктор на вход получает массив Number. Элементы не могут повторяться. Элементы массива внутри объекта
*раскладываются в подходящую коллекцию (выбрать самостоятельно).
*Существует метод summator, возвращающий сумму всех элементов коллекции.
*Существует метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель, являющийся
 *аргументом метода. Хранящиеся в объекте данные полностью заменяются результатами деления.
*Необходимо правильно переопределить методы toString, hashCode, equals, чтобы можно было использовать MathBox для вывода* данных на экран и хранение объектов этого класса в коллекциях (например, hashMap). Выполнение контракта обязательно!
*Создать метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его.
*
 * Благодаря паттерну "Команда" операции превратили в обьекты
 */
public class Main {

    public static void main(String[] args) {
        Number[] number = {160, 2.333f, 62.23, 56.0f, 10930244088L, 120478, 100};
        Number[] number1 = {160, 2.333f, 62.23, 56.0f, 10930244088L, 120478, 100};
        MathBox<Number> mathBox = new MathBox<>(number);
        MathBox<Number> mathBox1 = new MathBox<>(number1);
        System.out.println(mathBox.equals(mathBox1));
        System.out.println(mathBox.toString());
        System.out.println(mathBox.hashCode());

        Command summator = new Summator(mathBox);
        Command splitter = new Splitter<>(mathBox, 10);
        Command delInteger = new DelInteger(mathBox, 16);

        Invoker invoker = new Invoker(summator, splitter, delInteger);


        System.out.println("Сумматор: ");
        invoker.summatorComand();
        System.out.println("Сплиттер: ");
        invoker.splitterCommand();
        System.out.println(mathBox.toString());
        System.out.println("Delete Integer: ");
        invoker.delIntegerCommand();
        System.out.println(mathBox.toString());

    }

}