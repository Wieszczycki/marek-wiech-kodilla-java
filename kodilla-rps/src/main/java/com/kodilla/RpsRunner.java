package com.kodilla;

import java.util.Scanner;

public class RpsRunner {

    public static String playerName;

    public static void main(String[] args) {

        playerName = getPlayerName();
        int numberOfRounds;
        boolean end = false;

        //gra
        while (!end) {
            numberOfRounds = getNumberOfRounds();
            RpsGame game = new RpsGame(numberOfRounds, playerName);
            char nextGame = game.playGame();
            end = (nextGame != 'n');
        }

        //podsumowanie
        System.out.println();
        System.out.println("Podsumowanie całej gry - liczba gier wygranych przez ciebie: " + RpsGame.gamesWonByP1
                + ", liczba wygranych gier przeciwnika: " + RpsGame.gamesWonByP2);
    }

    private static String getPlayerName() {
        System.out.println("Podaj swoje imię: ");
        Scanner sc = new Scanner((System.in));
        String playerName = sc.next();
        System.out.println("Witaj " + playerName + "!");
        return playerName;
    }

    private static int getNumberOfRounds() {
        System.out.println("Podaj ile rund trzeba wygrać, aby wygrać całą grę: ");
        Scanner sc = new Scanner((System.in));
        String koncowka;
        int numberOfRound = sc.nextInt();
        if (numberOfRound == 1) {
            koncowka = " rundę.";
        } else if (numberOfRound > 1 && numberOfRound < 5) {
            koncowka = " rundy.";
        } else {
            koncowka = " rund.";
        }
        System.out.println("Dobrze, rozegramy " + numberOfRound + koncowka);
        return numberOfRound;
    }
}
