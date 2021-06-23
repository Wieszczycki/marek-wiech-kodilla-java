package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Jerzy Chmurka", "Finansowa burza", 2000, "1");
        Book book2 = new Book("Andrzej Deszczyński", "Rady na opady", 2008, "2");
        Book book3 = new Book("Julia Gradowska", "Śnieżynki krachów finansowych", 2016, "3");
        Book book4 = new Book("Tomasz Mżawiński", "Opary kryzysu", 2018, "4");
        Book book5 = new Book("Lena Grom", "Błyskawiczne dochody w 24 lata", 2020, "5");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int medianPublicationYear = medianAdapter.publicationYearMedian(books);
        // Then
        assertEquals(2016, medianPublicationYear);
    }
}
