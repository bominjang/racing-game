package org.ccstudy.racing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RaceTest {

    Race race;
    List<String> expect;
    int NUMBER_OF_CARS = 3;
    int TIMES = 5;

    @Before
    public void setUp() throws Exception {
        race = new Race(NUMBER_OF_CARS, TIMES);
        expect = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        race = null;
    }

    @Test
    public void 난수발생레이스결과() {
        race.run();
        assertEquals(expect, race.getStatus());
    }

    @Test
    public void 두칸전진차량결과확인() {
        Car car = new Car();
        car.foward(5);
        car.foward(5);
        assertEquals(2, car.getPosition());

        assertEquals("---", car.drawPosition());
    }
}