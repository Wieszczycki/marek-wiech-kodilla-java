package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "Method failed.";

        try {
            result = secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("Argument x>=2 OR x<1 OR y!=1.5");
        } finally {
            System.out.println(result);
        }
    }
}
