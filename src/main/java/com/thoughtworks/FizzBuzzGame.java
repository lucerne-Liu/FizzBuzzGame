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
        String result = "";
        if (Integer.toString(i).contains("3")) {
            return "Fizz";
        }
        if (i == 3 || i % 3 == 0) {
            result += "Fizz";
        }
        if (i == 5 || i % 5 == 0) {
            result += "Buzz";
        }
        if (i == 7 || i % 7 == 0) {
            result += "Whizz";
        }
        return result;
    }
}


