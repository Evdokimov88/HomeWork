package ru.innopolis.university.lesson2.task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

enum Sex {
    MAN,
    WOMAN;

    //Создаем из перечеслений неизменяемый список
    private static final List<Sex> value =
            Collections.unmodifiableList(Arrays.asList(values()));

    private static final Random random = new Random();

    //Выбираем случайный элемент списка
    public static Sex randomSex() {
        return value.get(random.nextInt(value.size()));
    }
}
