package com.kodilla.patterns.factory.tasks;

public class PaitingTask implements Task {
    private boolean executed;
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaitingTask(String taskName, String color, String whatToPaint) {
        executed = false;
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
