package ru.innopolis.university.lesson2.task2;

class NegativeNumberException extends Exception {
    private double value;
    NegativeNumberException(double value) {
        this.value = value;
    }
    // переопределенный метод toString() класса Throwable,
// этот метод выводит информацию об исключении типа NegativeNumberException
    public String toString() {
        String msg = "Exception: " + value + " is a negative number!!!";
        return msg;
    }
}
