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

}