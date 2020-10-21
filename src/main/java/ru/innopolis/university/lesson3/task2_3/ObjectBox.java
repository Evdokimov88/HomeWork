package ru.innopolis.university.lesson3.task2_3;

import java.util.ArrayList;
import java.util.List;

public class ObjectBox<T> {
   private List<T> objectList = new ArrayList<>();


    public void addObject(T obj) throws Exception {

        objectList.add(obj);
    }

    public void deleteObject(T obj) {
        objectList.remove(obj);
    }

    public void dump() {
        System.out.println(objectList);
    }

    public List<T> getObjectList() {
        return objectList;
    }

    public void setObjectList(ArrayList<T> objectList) {
        this.objectList = objectList;
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "objectHashSet=" + objectList +
                '}';
    }
}
