package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Task to do");
        board.getInProgressList().addTask("Task in progress");
        board.getDoneList().addTask("Task done");

        //Then
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Task done", board.getDoneList().getTasks().get(0));
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}
