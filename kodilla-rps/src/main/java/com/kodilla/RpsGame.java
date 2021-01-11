package com.kodilla;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    public static int numberOfGames;
    public static int gamesWonByP1 = 0;
    public static int gamesWonByP2 = 0;

    private boolean end = false;
    private final int numberOfRounds;
    private int round = 0;
    private final String playerName;
    private int winsOfP1 = 0;
    private int winsOfP2 = 0;

    public RpsGame(int numberOfRounds, String playerName) {
        this.numberOfRounds = numberOfRounds;
        this.playerName = playerName;
        numberOfGames++;
    }

    public char playGame() {

        printManual();
        //wybór czy gra normalna, czy rozszerzona o jaszczurkę i Spocka
        char type = readAction();
        boolean spock = (type == 't');

        while(!end) {
            round++;
            if (!spock) {
                System.out.println("Runda " + round + ". Wykonaj ruch 1, 2 lub 3:");
            } else {
                System.out.println("Runda " + round + ". Wykonaj ruch 1, 2, 3, 4 lub 5:");
            }

            //ruch człowieka
            String moveP1 = getAction(Integer.parseInt(Character.toString(readAction())));
            System.out.println(playerName + ", wybrałeś: " + moveP1 + ".");

            //losowanie ruchu komputera
            String moveP2 = getAction(drawComputerAction(spock));
            System.out.println("Przeciwnik wybrał: " + moveP2 + ".");

            //wynik rundy
            int winner = getWinner(moveP1, moveP2, spock);
            if (winner == 1) {
                System.out.print("Wygrałeś rundę! ");
                winsOfP1++;
            } else if (winner == 2) {
                System.out.print("Przeciwnik wygrał rundę. ");
                winsOfP2++;
            } else if (winner == 3) {
                System.out.print("Ruchy są różne, ale żaden z nich nie wygrywa. ");
                winsOfP2++;
            } else {
                System.out.println("Remis. ");
            }

            //wynik gry
            if (winsOfP1 == numberOfRounds) {
                System.out.println("Wygrałeś całą grę! Ty wygrałeś " + winsOfP1
                        + " rund, a twój przeciwnik " + winsOfP2 + " rund.");
                gamesWonByP1++;
                end = true;
            } else if (winsOfP2 == numberOfRounds) {
                System.out.println("Przeciwnik wygrał całą grę! Przeciwnik wygrał " + winsOfP2
                        + " rund, a ty " + winsOfP1 + " rund.");
                gamesWonByP2++;
                end = true;
            } else {
                System.out.println("Aktualna punktacja: " + playerName + "=" + winsOfP1
                        + ", przeciwnik=" + winsOfP2 + ". (Gra trwa do " + numberOfRounds + " wygranych rund)");
            }
        }

        //kończymy albo rozpoczynamy na nowo
        System.out.println("A teraz albo kończymy grę (klawisz 'x'), albo zaczynamy od nowa (klawisz 'n')");
        return readAction();
    }

    private void printManual() {
        System.out.println("Rozpoczynamy grę nr " + numberOfGames + ". Wciśnij klawisz:");
        System.out.println("1 - zagranie 'kamienia'");
        System.out.println("2 - zagranie 'papieru'");
        System.out.println("3 - zagranie 'nożyc'");
        System.out.println("4 - wersja rozszerzona: zagranie 'jaszczurki'");
        System.out.println("5 - wersja rozszerzona: zagranie 'Spocka'");
        System.out.println("x - zakończenie gry");
        System.out.println("n - uruchomienie gry od nowa");
        System.out.println();
        System.out.println("Ale najpierw pytanie: czy gra ma być normalna (klawisz 'n'), czy rozszerzona (klawisz 't')?");
    }

    private char readAction() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    private int drawComputerAction(boolean spock) {
        Random generator = new Random();
        if (spock) {
            return generator.nextInt(5) + 1;
        } else {
            return generator.nextInt(3) + 1;
        }
    }

    private String getAction(int action) {
        String result;

        switch (action) {
            case 1:
                result = "kamień";
                break;
            case 2:
                result = "papier";
                break;
            case 3:
                result = "nożyce";
                break;
            case 4:
                result = "jaszczurka";
                break;
            case 5:
                result = "Spock";
                break;
            default:
                //małe "obejście" problemu, bo czas zająć się kolejnymi modułami: jeśli ktoś wybierze zły klawisz
                //to po prostu gra przypisze mu wtedy wybór "kamienia"
                result = "kamień";
        }
        return result;
    }

    private int getWinner(String moveP1, String moveP2, boolean spock) {

        //sytuacja kiedy odpowiedzi się różnią, ale jest niewygrywająca
        int result = 3;

        //remis
        if (moveP1.equals(moveP2)) result = 0;

        //wygrywa P1
        if (moveP1.equals("kamień") && moveP2.equals("nożyce")) result = 1;
        if (moveP1.equals("nożyce") && moveP2.equals("papier")) result = 1;
        if (moveP1.equals("papier") && moveP2.equals("kamień")) result = 1;

        if (moveP1.equals("kamień") && moveP2.equals("jaszczurka")) result = 1;
        if (moveP1.equals("jaszczurka") && moveP2.equals("Spock")) result = 1;
        if (moveP1.equals("Spock") && moveP2.equals("nożyce")) result = 1;
        if (moveP1.equals("nożyce") && moveP2.equals("jaszczurka")) result = 1;
        if (moveP1.equals("jaszczurka") && moveP2.equals("papier")) result = 1;
        if (moveP1.equals("papier") && moveP2.equals("Spock")) result = 1;
        if (moveP1.equals("Spock") && moveP2.equals("kamień")) result = 1;

        //wygrywa P2
        if (moveP2.equals("kamień") && moveP1.equals("nożyce")) result = 2;
        if (moveP2.equals("nożyce") && moveP1.equals("papier")) result = 2;
        if (moveP2.equals("papier") && moveP1.equals("kamień")) result = 2;

        if (moveP2.equals("kamień") && moveP1.equals("jaszczurka")) result = 2;
        if (moveP2.equals("jaszczurka") && moveP1.equals("Spock")) result = 2;
        if (moveP2.equals("Spock") && moveP1.equals("nożyce")) result = 2;
        if (moveP2.equals("nożyce") && moveP1.equals("jaszczurka")) result = 2;
        if (moveP2.equals("jaszczurka") && moveP1.equals("papier")) result = 2;
        if (moveP2.equals("papier") && moveP1.equals("Spock")) result = 2;
        if (moveP2.equals("Spock") && moveP1.equals("kamień")) result = 2;

        return result;
    }
}