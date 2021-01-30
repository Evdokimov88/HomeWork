package ru.innopolis.university.task17;

public class DelInteger implements Command {
    private MathBox mathBox;
    private Integer k;

    public DelInteger(MathBox mathBox, Integer k) {
        this.mathBox = mathBox;
        this.k = k;
    }


    @Override
    public void execute() {
        mathBox.delInteger(k);
    }
}
