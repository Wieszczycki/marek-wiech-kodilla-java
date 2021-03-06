package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //GIVEN
        //create library
        Library library = new Library("Amejzon");
        //creating book list
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.of(2000+n,1,1))));

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallow Merlin");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //deep copy
        Library deepClonedCopy = null;
        try {
            deepClonedCopy = library.deepCopy();
            deepClonedCopy.setName("Deep Merlin");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedCopy);

        //WHEN
        Book testBook = new Book("Title10", "Author10", LocalDate.of(2010,1,1));
        library.getBooks().remove(testBook);

        //THEN
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedCopy);
        assertEquals(9, library.getBooks().size());
        assertEquals(9, clonedLibrary.getBooks().size());
        assertEquals(10,deepClonedCopy.getBooks().size());
    }
}
