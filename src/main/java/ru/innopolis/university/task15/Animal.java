package ru.innopolis.university.task15;


public class Animal {
    int id;
    String nickname;
    Person person;
    double weigth;

    public Animal(int id, String nickname, Person person, double weigth) {
        this.id = id;
        this.nickname = nickname;
        this.person = person;
        this.weigth = weigth;
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

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", person=" + person +
                ", weigth=" + weigth +
                '}' + "\n";
    }
}