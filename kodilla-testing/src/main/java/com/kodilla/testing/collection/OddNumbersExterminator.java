package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private ArrayList<Integer> oddNumbers;

    public List<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for(Integer i: numbers) {
            if (i % 2 == 0) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;

    }
}
