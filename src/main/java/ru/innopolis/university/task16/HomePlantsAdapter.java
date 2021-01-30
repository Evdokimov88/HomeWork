package ru.innopolis.university.task16;


public class HomePlantsAdapter extends Animal{

    private HomePlants homePlants;

    public HomePlantsAdapter(HomePlants homePlants) {
        super(homePlants.id, homePlants.nickname, homePlants.person, homePlants.weigth);
          this.homePlants = homePlants;


    }


}
