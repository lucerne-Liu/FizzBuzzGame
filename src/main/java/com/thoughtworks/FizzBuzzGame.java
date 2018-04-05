package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {

    }


    public List<String> getResults() {
        return results;
    }

    public String replace(int i) {
        if (i == 3 || i % 3 == 0) {
            return "Fizz";
        } else if (i == 5 || i % 5 == 0) {
            return "Buzz";
        } else if (i == 7 || i % 7 == 0) {
            return "Whizz";
        }
        return Integer.toString(i);
    }
}


