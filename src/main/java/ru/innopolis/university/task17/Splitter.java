package ru.innopolis.university.task17;

public class Splitter<T extends Number> implements Command {

    private MathBox mathBox;
    private T n;

    public Splitter(MathBox mathBox, T n) {
        this.mathBox = mathBox;
        this.n = n;
    }

    @Override
    public void execute() {
        mathBox.splitter(n);
    }
}
