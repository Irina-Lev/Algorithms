package com.example.average;

import java.util.ArrayList;
import java.util.List;

public class RollingAverage {

   List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        List<Double> rollingAverage = new ArrayList<>();
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + arr.get(i);
        }
        rollingAverage.add(sum / k);

        for(int i = k; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            sum = sum - arr.get(i-k);
            rollingAverage.add(sum / k);
        }

        return rollingAverage;
    }
}
