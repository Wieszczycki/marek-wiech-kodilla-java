package com.kodilla.testing.library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Collection Case: test #" + testCounter);
    }

    @AfterEach
    public void after() {
        System.out.println();
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4,theListOfBooks.size());
        //assertTrue(false);
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any titles");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0,theListOfBooks0.size());
        assertEquals(15,theListOfBooks15.size());
        assertEquals(0,theListOfBooks40.size());
        //assertTrue(false);

    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        /* when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books); REMOVED AS UNNECESSARY STUB */

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        //assertTrue(false);

    }

    @Test
    public void testListBooksInHandsOf0Books() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book>listOf0Books = new ArrayList<>(); //pusta lista
        LibraryUser libraryUser = mock(LibraryUser.class);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(listOf0Books);

        //When
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);
        System.out.println("0 books: " + resultListBooksInHandsOf);

        //Then
        assertEquals(0, resultListBooksInHandsOf.size());
    }

    @Test
    public void testListBooksInHandsOf1Book() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book>listOf1Book = generateListOfNBooks(1); //lista z 1 książką
        LibraryUser libraryUser = mock(LibraryUser.class);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(listOf1Book);

        //When
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);
        System.out.println("1 book: " + resultListBooksInHandsOf);

        //Then
        assertEquals(1, resultListBooksInHandsOf.size());
    }

    @Test
    public void testListBooksInHandsOf5Books() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book>listOf5Books = generateListOfNBooks(5); //lista z 5 książkami
        LibraryUser libraryUser = mock(LibraryUser.class);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(listOf5Books);

        //When
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);
        System.out.println("5 books: " + resultListBooksInHandsOf);

        //Then
        assertEquals(5, resultListBooksInHandsOf.size());
    }


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}
