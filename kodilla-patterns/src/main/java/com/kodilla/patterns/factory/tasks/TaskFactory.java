package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("The Driving task.", "szpital tymczasowy", "Uber");
            case PAINTING:
                return new PaitingTask("The Painting task.", "purpurowy", "sufit");
            case SHOPPING:
                return new ShoppingTask("The Shopping task.", "kartofelki", 2.0);
            default:
                return null;
        }
    }
}
