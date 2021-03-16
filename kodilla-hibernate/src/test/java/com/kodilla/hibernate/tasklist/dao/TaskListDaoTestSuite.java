package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "test1";
    private static final String DESCRIPTION = "Test: TASKLISTS ";

    @Test
    void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        List<TaskList> readTask = taskListDao.findByListName(LISTNAME);
        assertEquals(1, readTask.size());
        System.out.println("Znalezione zadanie: " + readTask);

        //CleanUp
        taskListDao.deleteById(id);
    }

}
