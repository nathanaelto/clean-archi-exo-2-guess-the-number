package org.esgi.al.ex2.core.game;

import java.util.Random;

public class GuessTheNumberGenerator {
    final int maxNumber;

    private GuessTheNumberGenerator(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public static GuessTheNumberGenerator create(int maxNumber) {
        return new GuessTheNumberGenerator(maxNumber);
    }

    public int generateNumber() {
        Random generator = new Random();
        return generator.nextInt(maxNumber) + 1;
    }
}
