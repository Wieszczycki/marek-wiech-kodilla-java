package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        System.out.println("Displaying elements of array:");
        for(int n : numbers) {
            System.out.println(n);
        }

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        System.out.println("Average = " + average);
        return average.getAsDouble();

    }
}
