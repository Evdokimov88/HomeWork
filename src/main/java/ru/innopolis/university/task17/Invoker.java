package ru.innopolis.university.task17;

public class Invoker {
    private Command summator;
    private Command splitter;
    private Command delInteger;

    public Invoker(Command summator, Command splitter, Command delInteger) {
        this.summator = summator;
        this.splitter = splitter;
        this.delInteger = delInteger;
    }

    public void summatorComand() {
        summator.execute();
    }

    public void splitterCommand() {
        splitter.execute();
    }

    public void delIntegerCommand() {
        delInteger.execute();
    }
}
