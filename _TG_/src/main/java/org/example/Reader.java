package org.example;

import java.util.Scanner;

public class Reader implements InputReader {
    private static final Scanner scanner = new Scanner(System.in);

    public BotRequest getUserInput() {
        return (new BotRequest(scanner.nextLine()));
    }
}
