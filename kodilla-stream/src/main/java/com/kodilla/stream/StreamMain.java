package com.kodilla.stream;

/*
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;
*/


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

/*
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("koza", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Kapibara", String::toUpperCase);
        poemBeautifier.beautify("KOZA", String::toLowerCase);
        poemBeautifier.beautify("koza", text -> "1. " + text + " 2. " + text + " 3. " + text);
        poemBeautifier.beautify("Kapibara", text -> text + text.length());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
*/
/*
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map((s -> s.substring(0,s.indexOf(' ') + 2) + ". "))
                .filter((s -> s.substring(0, 1).equals("M")))
                .forEach(System.out::println);
*/

        BookDirectory theBookDirectory = new BookDirectory();

/*
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(Book -> Book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);    }
*/
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();

        LocalDate ageOf20 = LocalDate.parse("2000-01-01");

        Map<Integer, ForumUser> theResultStringOfForum = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(ageOf20))
                .filter(forumUser -> forumUser.getPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println();
        System.out.println("Spacer po liście użytkowników forum (tylko mężczyźni, co najmniej 20 lat i 2 posty).");
        System.out.println("Elements of map: " + theResultStringOfForum.size());
        theResultStringOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
