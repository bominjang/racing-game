package com.ccstudy.racing;

import com.ccstudy.racing.common.FixedNumberGenerator;
import com.ccstudy.racing.model.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void 다섯번_시도_결과() {
        //given
        Car car = new Car("aa");
        int numberOfAttempt = 5;

        //when
        car.attemptToMove(new FixedNumberGenerator().generateNumber(numberOfAttempt));

        //then
        assertEquals(car.converter(),"aa : ---");
    }

    @Test
    public void 일곱번_시도했을때_4칸전진() {
        Car car = new Car("aa");
        int numberOfAttempt = 7;

        car.attemptToMove(new FixedNumberGenerator().generateNumber(numberOfAttempt));

        assertEquals(car.converter(),"aa : ----");
    }
}