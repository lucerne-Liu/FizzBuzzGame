package com.thoughtworks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputReader {
    private Scanner scanner = new Scanner(System.in);

    public String read() throws Exception {
        String input = scanner.next();
        Pattern pattern = Pattern.compile("-?[0-9]*");
        if (pattern.matcher(input).matches() && Integer.parseInt(input) > 0) {
            return input;
        }
        throw new Exception("Invalid Input");
    }
}
