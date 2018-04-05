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
        switch (i) {
            case 3:
                return "Fizz";
            case 5:
                return "Buzz";
            case 7:
                return "Whizz";
            default:
                return Integer.toString(i);
        }
    }
}


