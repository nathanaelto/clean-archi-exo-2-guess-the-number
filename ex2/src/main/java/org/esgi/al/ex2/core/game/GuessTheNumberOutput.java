package org.esgi.al.ex2.core.game;

public class GuessTheNumberOutput {
    static void printWelcomeMessage() {
        System.out.println("-===========================-");
        System.out.println("=== GUESS THE NUMBER GAME ===");
        System.out.println("-===========================-");
    }

    static void printGuessTheNumberMessage() {
        System.out.println("Guess the number (between 1 and 100)!");
    }

    static void printDebugMessage(int number) {
        System.out.println("debug : the expected number is " + number);
    }

    static void printWrongMessage(int userGuess, int number, int attempts, int maxAttempts) {
        String divergence = userGuess < number ? "smaller" : "greater";
        System.out.println("Wrong! Your number is " + divergence + " than the correct one. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
    }

    static void printInvalidInputMessage(String input, int attempts, int maxAttempts) {
        System.out.println("Your input was '" + input + "', please enter a valid integer. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
    }

    static void printWinMessage(int attempts) {
        System.out.println("You found it after " + attempts + " tries!");
    }

    static void printLoseMessage(int number, int maxAttempts) {
        System.out.println("You lose after " + maxAttempts + " tries, the expected number was " + number);
    }

    static void printTryAgainMessage() {
        System.out.println("----------------------------------------------------");
        System.out.println("Do you want to try again with a new number (yes/no)?");
    }

    static void printThanksMessage() {
        System.out.println("== Thanks for playing! ==");
    }
}
