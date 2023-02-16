package org.esgi.al.ex2.core.game;

public class GuessTheNumberGame {
    final GuessTheNumberRules rules;
    final GuessTheNumberGenerator generator;
    final GuessTheNumberInput input;
    GuessTheNumberDataGame dataGame;

    private GuessTheNumberGame(GuessTheNumberRules rules, GuessTheNumberGenerator generator, GuessTheNumberInput input, GuessTheNumberDataGame dataGame) {
        this.rules = rules;
        this.generator = generator;
        this.input = input;
        this.dataGame = dataGame;
    }

    public static GuessTheNumberGame newGame(GuessTheNumberRules rules, GuessTheNumberGenerator generator, GuessTheNumberInput input) {
        int expectedNumber = generator.generateNumber();
        final GuessTheNumberDataGame dataGame = GuessTheNumberDataGame.newGame(expectedNumber);
        return new GuessTheNumberGame(rules, generator, input, dataGame);
    }
    public void play() {
        GuessTheNumberOutput.printGuessTheNumberMessage();
        while (!isGameOver(dataGame.getCounterTry())) {
            String userInput = this.input.readInput();
            this.dataGame.incrementCounterTry();

            int userGuess = 0;
            try {
                userGuess = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                GuessTheNumberOutput.printInvalidInputMessage(userInput, dataGame.getCounterTry(), rules.maxAttempts());
                continue;
            }

            if (isCorrectGuess(dataGame.getExpectedNumber(), userGuess)) {
                GuessTheNumberOutput.printWinMessage(userGuess);
                break;
            } else {
                GuessTheNumberOutput.printWrongMessage(userGuess, dataGame.getExpectedNumber(), dataGame.getCounterTry(), rules.maxAttempts());
            }
        }
        if (isGameOver(dataGame.getCounterTry())) {
            GuessTheNumberOutput.printLoseMessage(rules.maxAttempts(), dataGame.getExpectedNumber());
        }
    }

    private boolean isCorrectGuess(int number, int guess) {
        return number == guess;
    }

    private boolean isGameOver(int attempts) {
        return attempts >= rules.maxAttempts();
    }


}
