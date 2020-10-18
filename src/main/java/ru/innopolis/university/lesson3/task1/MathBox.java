package ru.innopolis.university.lesson3.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class MathBox<T extends Number> {
    List<Number> arrList;
    private int hashCode;

    MathBox(T[] number) {
        this.arrList =new ArrayList(Arrays.asList(number));
    }

     public double summator() {
        double sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            sum = arrList.get(i).doubleValue() + sum;
        }
        return sum;
    }

    public <T extends Number> void splitter(T n) {
        if (n.doubleValue() != 0) {
            for (int i = 0; i < arrList.size(); i++) {
                arrList.set(i, (arrList.get(i).doubleValue() / n.doubleValue()));
            }
        } else {
            System.out.println("На ноль делить нельзя");
        }
    }

    public void delInteger(Integer k) {
        arrList.removeIf(number -> number.equals(k.doubleValue()));

}


    @Override
    public String toString() {
        return "MathBox{" +
                "arrList=" + arrList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox<?> mathBox = (MathBox<?>) o;
        return arrList.equals(mathBox.arrList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrList, hashCode);
    }
}

