package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private InputReader reader = new InputReader();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(replace(i));
        }
    }

    public void init() throws Exception {
        System.out.println("请输入学生个数：");
        start(Integer.parseInt(reader.read()));
        getResults().forEach(System.out::println);
    }

    public List<String> getResults() {
        return results;
    }

    public String replace(int i) {
        String result = "";
        if (Integer.toString(i).contains("3")) {
            return "Fizz";
        }
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (i % 7 == 0) {
            result += "Whizz";
        }
        if (result.equals("")) {
            result = Integer.toString(i);
        }
        return result;
    }
}


