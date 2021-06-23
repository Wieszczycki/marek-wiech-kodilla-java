package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTestSuite {

    @Test
    public void testUpdate() {
        // Given
        Task user1 = new TasksOfUser1();
        Task user2 = new TasksOfUser2();
        Task user3 = new TasksOfUser3();
        Mentor mentor1 = new Mentor("Aleksander Pierwszy");
        Mentor mentor2 = new Mentor("Joachim Drugi");
        user1.registerObserver(mentor1);
        user2.registerObserver(mentor1);
        user3.registerObserver(mentor2);
        // When
        user1.addTask("Task 1: helloWorld()");
        user1.addTask("Task 2: goodByeWorld()");
        user2.addTask("Task 3: addBug()");
        user2.addTask("Task 4: removeBug()");
        user1.addTask("Task 5: removeAll()");
        user3.addTask("Task 6: createBottombook()");
        // Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}
