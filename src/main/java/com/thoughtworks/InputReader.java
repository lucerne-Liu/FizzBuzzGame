package com.thoughtworks;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner = new Scanner(System.in);

    public String read() {
        return scanner.next();
    }
}
