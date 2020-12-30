package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "Czesław", 'M', LocalDate.of(2009, 12, 3), 1));
        listOfUsers.add(new ForumUser(2, "Wiesław", 'M', LocalDate.of(2005, 11, 3), 2));
        listOfUsers.add(new ForumUser(3, "Mieczysław", 'M', LocalDate.of(1979, 10, 3), 3));
        listOfUsers.add(new ForumUser(4, "Ścibor", 'M', LocalDate.of(1969, 9, 3), 4));
        listOfUsers.add(new ForumUser(5, "Gromosław", 'M', LocalDate.of(1959, 8, 3), 5));
        listOfUsers.add(new ForumUser(6, "Wienczysława", 'F', LocalDate.of(1999, 7, 3), 6));
        listOfUsers.add(new ForumUser(7, "Lena", 'F', LocalDate.of(2009, 6, 3), 7));
        listOfUsers.add(new ForumUser(8, "Dżessika", 'F', LocalDate.of(1989, 5, 3), 8));
        listOfUsers.add(new ForumUser(9, "Antonina", 'F', LocalDate.of(1959, 4, 3), 9));
        listOfUsers.add(new ForumUser(10, "Maria", 'F', LocalDate.of(1979, 3, 3), 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfUsers);
    }
}
