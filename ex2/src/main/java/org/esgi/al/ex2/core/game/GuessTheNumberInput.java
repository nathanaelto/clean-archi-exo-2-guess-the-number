package org.esgi.al.ex2.core.game;

import java.util.Scanner;

public class GuessTheNumberInput {
    final Scanner scanner;

    private GuessTheNumberInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public static GuessTheNumberInput create(Scanner scanner) {
        return new GuessTheNumberInput(new Scanner(System.in));
    }

    public void destroy() {
        scanner.close();
    }

    public String readInput() {
        return scanner.nextLine();
    }
}
