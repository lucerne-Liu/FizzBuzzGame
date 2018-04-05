package com.thoughtworks;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner = new Scanner(System.in);

    public String read() throws Exception {
        String input = scanner.next();
        if (Integer.parseInt(input) > 0) {
            return scanner.next();
        }
        throw new RuntimeException("Invalid Input");
    }
}
