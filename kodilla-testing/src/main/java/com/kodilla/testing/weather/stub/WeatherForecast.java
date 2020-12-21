package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAvgTemp() {
        double sum = 0.00;
        int counter = 0;
        double avgTemp = 0.00;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
            counter++;
        }
        avgTemp = sum / counter;

        System.out.println("sum = " + sum);
        System.out.println("counter = " + counter);
        System.out.println("avgTemp = " + avgTemp);

        return avgTemp;
    }

    public double calculateMedianTemp() {

        int tempSize = temperatures.getTemperatures().size();
        System.out.println("tempSize = " + tempSize + ", values:");

        //ArrayList<Double> tempSet =new ArrayList<Double>();
        double[] tempSet = new double[tempSize];
        double median = 0.00;
        int counter = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
                    System.out.println(temperature.getValue().doubleValue());
                    tempSet[counter] = temperature.getValue().doubleValue();
                    counter++;
        }

        Arrays.sort(tempSet);
        System.out.println("tempSet sorted: ");
        for (int i = 0; i < tempSet.length; i++)
            System.out.println(tempSet[i]);

        if (tempSet.length % 2 == 0 ) {
            median = (tempSet[tempSet.length / 2] + tempSet[tempSet.length / 2 - 1]) / 2;
        } else {
            median = tempSet[tempSet.length / 2];
        }
        System.out.println("median = " + median);

        return median;
    }
}
