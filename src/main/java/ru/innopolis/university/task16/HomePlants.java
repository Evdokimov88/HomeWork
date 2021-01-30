package ru.innopolis.university.task16;

public class HomePlants {

    int id;
    String nickname;
    Person person;
    double weigth;

    public HomePlants(int id, String nickname, Person person, double weigth) {
        this.id = id;
        this.nickname = nickname;
        this.person = person;
        this.weigth=weigth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
}
