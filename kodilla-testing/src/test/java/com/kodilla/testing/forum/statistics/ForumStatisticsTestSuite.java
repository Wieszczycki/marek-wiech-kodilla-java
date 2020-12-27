package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    private static ForumAdvStatistics forumAdvStatistics;

    @Mock
    Statistics statisticsMock;
    List<String> listMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All test are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

        forumAdvStatistics = new ForumAdvStatistics();
        Statistics statisticsMock = mock(Statistics.class);
    }

    @AfterEach
    public void afterEveryTest() {
        //System.out.println("Users: " + listMock);
        forumAdvStatistics.showStatistics();
    }


    @Nested
    class TestPosts {

        @Test
        @DisplayName("test0Posts")
        void test0Posts() {
            System.out.println("TEST: 0 posts");
            //Given
            List<String> listMock = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listMock.add("Jim User" + i);}
            when(statisticsMock.usersNames()).thenReturn(listMock);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(10);

            //When
            forumAdvStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0, forumAdvStatistics.getQuantityPosts());
        }

        @Test
        void test1000Posts() {
            System.out.println("TEST: 1000 posts");
            //Given
            List<String> listMock = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listMock.add("Jim User" + i);}
            when(statisticsMock.usersNames()).thenReturn(listMock);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(10);

            //When
            forumAdvStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(1000, forumAdvStatistics.getQuantityPosts());
        }

        @Test
        void test0Comments() {
            System.out.println("TEST: 0 comments");
            //Given
            List<String> listMock = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listMock.add("Jim User" + i);}
            when(statisticsMock.usersNames()).thenReturn(listMock);
            when(statisticsMock.postsCount()).thenReturn(20);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            forumAdvStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0, forumAdvStatistics.getQuantityComments());
        }

        @Test
        void testCommentsLessThanPosts() {
            System.out.println("TEST: comments less than posts");
            //Given
            List<String> listMock = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listMock.add("Jim User" + i);}
            when(statisticsMock.usersNames()).thenReturn(listMock);
            when(statisticsMock.postsCount()).thenReturn(20);
            when(statisticsMock.commentsCount()).thenReturn(10);
            boolean result = false;

            //When
            forumAdvStatistics.calculateAdvStatistics(statisticsMock);
            if (forumAdvStatistics.getQuantityComments() < forumAdvStatistics.getQuantityPosts()) {
                result = true;
            }

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testCommentsMoreThanPosts() {
            System.out.println("TEST: comments more than posts");
            //Given
            List<String> listMock = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listMock.add("Jim User" + i);}
            when(statisticsMock.usersNames()).thenReturn(listMock);
            when(statisticsMock.postsCount()).thenReturn(20);
            when(statisticsMock.commentsCount()).thenReturn(40);
            boolean result = false;

            //When
            forumAdvStatistics.calculateAdvStatistics(statisticsMock);
            if (forumAdvStatistics.getQuantityComments() > forumAdvStatistics.getQuantityPosts()) {
                result = true;
            }

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void test0Users() {
            System.out.println("TEST: 0 users");
            //Given
            List<String> listMock = new ArrayList<>();
            //for (int i = 0; i < 10; i++) {
            //    listMock.add("Jim User" + i);}
            when(statisticsMock.usersNames()).thenReturn(listMock);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(10);

            //When
            forumAdvStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0, forumAdvStatistics.getQuantityUsers());
        }

        @Test
        void test100Users() {
            System.out.println("TEST: 1000 users");
            //Given
            List<String> listMock = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                listMock.add("Jim User" + i);}
            when(statisticsMock.usersNames()).thenReturn(listMock);
            when(statisticsMock.postsCount()).thenReturn(200);
            when(statisticsMock.commentsCount()).thenReturn(1000);

            //When
            forumAdvStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(100, forumAdvStatistics.getQuantityUsers());
        }

    }
}
