package org.esgi.al.ex2.core.game;

public class GuessTheNumberDataGame {
    private int userGuess;
    private int counterTry;
    private int expectedNumber;

    private GuessTheNumberDataGame(int userGuess, int counterTry, int expectedNumber) {
        this.userGuess = userGuess;
        this.counterTry = counterTry;
        this.expectedNumber = expectedNumber;
    }

    public static GuessTheNumberDataGame newGame(int expectedNumber) {
        return new GuessTheNumberDataGame(0, 0, expectedNumber);
    }

    public int getUserGuess() {
        return userGuess;
    }

    public int getCounterTry() {
        return counterTry;
    }

    public void incrementCounterTry() {
        counterTry++;
    }

    public int getExpectedNumber() {
        return expectedNumber;
    }
}
