package com.ccstudy.racing.model;

import com.ccstudy.racing.common.FixedNumberGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarResultTest {

    @Test
    public void 경주_결과_테스트() {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("aa");
        car1.attemptToMove(new FixedNumberGenerator().generateNumber(5));
        cars.add(car1);

        Car car2 = new Car("bb");
        car2.attemptToMove(new FixedNumberGenerator().generateNumber(3));
        cars.add(car2);

        Car car3 = new Car("cc");
        car3.attemptToMove(new FixedNumberGenerator().generateNumber(5));
        cars.add(car3);

        CarResult result = new CarResult(cars);

        assertEquals("aa,cc",result.getWinner());
    }
}