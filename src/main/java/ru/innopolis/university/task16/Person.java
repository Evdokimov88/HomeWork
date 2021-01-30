package ru.innopolis.university.task16;


class Person implements Comparable {
    String name;
    int age;
    Sex sex;



    Person(int age, Sex sex, String name) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.getName().compareTo(person.getName());
    }
}