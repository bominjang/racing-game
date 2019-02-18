package com.ccstudy.racing;

import com.ccstudy.racing.model.Car;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RacingCarServiceTest {

    @Test
    public void start() {
        RacingCarService racingCarService = new RacingCarService();

        List<Car> cars = racingCarService.race(5, 5);

        assertEquals(cars.size(), 5);
        cars.forEach(this::check);
    }

    private void check(Car car) {
        assertTrue(checkLength(car.converter()));
    }

    private boolean checkLength(String convert) {
        return convert.length() < 6 && convert.length() >= 0;
    }
}