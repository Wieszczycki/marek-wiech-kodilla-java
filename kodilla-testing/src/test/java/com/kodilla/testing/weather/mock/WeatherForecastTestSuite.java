package com.kodilla.testing.weather.mock;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    private static int testCounter = 0;
    Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Collection Case: test #" + testCounter);

        temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        //temperaturesMap.put("Jurata", 21.3); // do testu z parzystą liczbą sensorów
    }

    @AfterEach
    public void after() {
        System.out.println();
    }

    @Mock
    private Temperatures temperaturesMock;

    @DisplayName("testCalculateForecastWithMock")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        //Map<String, Double> temperaturesMap = new HashMap<>();

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    @DisplayName("testCalculateAvgTempWithMock")
    void testCalculateAvgTempWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemperature = weatherForecast.calculateAvgTemp();

        //Then
        Assertions.assertEquals(25.56, averageTemperature);
    }

    @DisplayName("testCalculateTempMedianWithMock")
    @Test
    void testCalculateTempMedianWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double temperatureMedian = weatherForecast.calculateMedianTemp();

        //Then
        Assertions.assertEquals(25.5, temperatureMedian);
    }
}
