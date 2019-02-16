package com.ccstudy.racing;

import com.ccstudy.racing.common.FixedNumberGenerator;
import com.ccstudy.racing.common.RacingResultConverter;
import com.ccstudy.racing.model.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class RacingResultConverterTest {

    @Test
    public void 일곱번_시도했을때_4칸전진(){
        Car car = new Car();

        car.attemptToMove(new FixedNumberGenerator().generateNumber(7));
        String result = RacingResultConverter.convert(car);

        assertEquals(result,"----");
    }
}