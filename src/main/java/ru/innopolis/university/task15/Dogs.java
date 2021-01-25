package ru.innopolis.university.task15;

public class Dogs extends Animal{
    public Dogs(int id, String nickname, Person person, double weigth) {
        super(id, nickname, person, weigth);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", person=" + person +
                ", weigth=" + weigth +
                '}'+"\n";
    }

}
