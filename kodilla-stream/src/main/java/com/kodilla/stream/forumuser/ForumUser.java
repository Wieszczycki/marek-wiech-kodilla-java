package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String user;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(int id, String user, char sex, LocalDate dateOfBirth, int posts) {
        this.id = id;
        this.user = user;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
