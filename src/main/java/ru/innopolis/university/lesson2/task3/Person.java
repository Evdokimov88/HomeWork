package ru.innopolis.university.lesson2.task3;


class Person implements Comparable {
    int age;
    Sex sex;
    String name;


    Person(int age, Sex sex, String name) {
        this.age = age;
        this.name = name;
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

    public static String createName(int arrayLength) {
        String eman = null;
        String alfabet = "ABCDE";
        StringBuilder name = new StringBuilder(5);/*Создаем обьект имя,
            который будет состоять из символов alfabet*/

        for (int k = 0; k < 5; k++) {
                /*Ниже выдергиваем символ из alfabet псевдослучайным образом
                и добавляем его в наше имя*/
            int index = (int) (alfabet.length() * Math.random());
            eman = name.append(alfabet.charAt(index)).toString();
        }

        return eman;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.getName().compareTo(person.getName());
    }

}
