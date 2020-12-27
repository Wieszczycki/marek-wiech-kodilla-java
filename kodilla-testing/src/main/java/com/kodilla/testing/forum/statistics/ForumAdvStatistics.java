package com.kodilla.testing.forum.statistics;

public class ForumAdvStatistics {

    private int quantityUsers;
    private int quantityPosts;
    private int quantityComments;
    private double avgUserPosts;
    private double avgUserComments;
    private double avgPostsComments;

    public void showStatistics() {

        System.out.println("Quantity of users: " + quantityUsers);
        System.out.println("Quantity of posts: " + quantityPosts);
        System.out.println("Quantity of comments: " + quantityComments);
        System.out.println("Average posts per user: " + avgUserPosts);
        System.out.println("Average comments per user: " + avgUserComments);
        System.out.println("Average comments per post: " + avgPostsComments);
        System.out.println();
    }

    public void calculateAdvStatistics(Statistics statistics) {

        quantityUsers = statistics.usersNames().size();
        quantityPosts = statistics.postsCount();
        quantityComments = statistics.commentsCount();

        avgUserPosts = calculateUserPosts();
        avgUserComments = calculateUserComments();
        avgPostsComments = calculatePostsComments();
    }

    private double calculateUserPosts() {

        if (quantityUsers > 0) {
            return (double) quantityPosts / quantityUsers;
        } else {
            return 0;
        }
    }

    private double calculateUserComments() {

        if (quantityUsers > 0) {
            return (double) quantityComments / quantityUsers;
        } else {
            return 0;
        }
    }

    private double calculatePostsComments() {

        if (quantityPosts > 0) {
            return (double) quantityComments / quantityPosts;
        } else {
            return 0;
        }
    }

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    public int getQuantityComments() {
        return quantityComments;
    }

    public double getAvgUserPosts() {
        return avgUserPosts;
    }

    public double getAvgUserComments() {
        return avgUserComments;
    }

    public double getAvgPostsComments() {
        return avgPostsComments;
    }
}
