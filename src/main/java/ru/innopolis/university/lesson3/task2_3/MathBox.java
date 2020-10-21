package ru.innopolis.university.lesson3.task2_3;


import java.util.*;


public class MathBox<T extends Number> extends ObjectBox<T> {

    MathBox(T[] number) {
        Set<T> arraySet = new HashSet<>(Arrays.asList(number));
        setObjectList(new ArrayList<>(arraySet));

    }


    public Double summator() {
        double sum = 0;
        for (Object numb : getObjectList()) {
            sum = ((T) numb).doubleValue() + sum;
        }
        return sum;
    }

    public <T extends Number> void splitter(T n) {
        if (n.doubleValue() != 0) {
            List<Number> numbList = (List<Number>) getObjectList();
            for (int i = 0; i < getObjectList().size(); i++) {
                numbList.set(i, (numbList.get(i).doubleValue() / n.doubleValue()));
            }
        } else {
            System.out.println("На ноль делить нельзя");
        }
    }

    public void delInteger(Integer k) {
        deleteObject((T) k);
    }


    @Override
    public void addObject(T obj) throws Exception {
        if (obj != null) {
            getObjectList().add(obj);

        } else {
            throw new Exception("write something");
        }
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "arrList=" + getObjectList() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return getObjectList().equals(mathBox.getObjectList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getObjectList());
    }
}


