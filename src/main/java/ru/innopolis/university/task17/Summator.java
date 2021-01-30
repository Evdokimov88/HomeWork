package ru.innopolis.university.task17;

public class Summator implements Command {
    private MathBox mathBox;

    public Summator(MathBox mathBox) {
        this.mathBox = mathBox;
    }

    @Override
    public void execute() {
        System.out.println(mathBox.summator());

    }
}
