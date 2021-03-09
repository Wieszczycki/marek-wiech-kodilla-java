package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private boolean executed;
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        executed = false;
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
