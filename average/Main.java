package com.example.average;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        RollingAverage rollingAverage = new RollingAverage();
        var resultList = rollingAverage.getRollingAverage(arr, 2);
        System.out.println(resultList);

        TestRollingAverage testRollingAverage = new TestRollingAverage();
        testRollingAverage.test();

    }
}
