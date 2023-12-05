package com.example.average;

import java.util.ArrayList;

public class TestRollingAverage {


    public void test(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);

        ArrayList<Double> contList = new ArrayList<>();
        contList.add(1.5);
        contList.add(2.5);
        contList.add(4.0);
        RollingAverage rollingAverage = new RollingAverage();
        var resList = rollingAverage.getRollingAverage(arr, 2);
        var result = contList.equals(resList);
        if (result) {
            System.out.println("Test done.");
        } else {
            System.out.println("Test not done.");
        }

    }
}
