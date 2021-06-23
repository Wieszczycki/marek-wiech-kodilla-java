package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Task task) {
        System.out.println("New task of pupil " + task.getPupilName() + " for Mentor: " + mentorName + "\n" +
                "TaskName: \"" + task.getTaskList().get(task.getTaskList().size()-1)  + "\", total: " + task.getTaskList().size() + " tasks.");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
