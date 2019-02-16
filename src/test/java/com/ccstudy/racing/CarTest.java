package com.ccstudy.racing;

import com.ccstudy.racing.common.FixedNumberGenerator;
import com.ccstudy.racing.model.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void 다섯번_시도_결과() {
        //given
        Car car = new Car();
        int numberOfAttempt = 5;

        //when
        car.attemptToMove(new FixedNumberGenerator().generateNumber(numberOfAttempt));

        //then
        assertEquals(car.getLocation(),3);
    }
}