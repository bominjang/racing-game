package org.ccstudy.racing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RaceServiceTest {

    RaceService raceService;
    List<String> expect;
    String CAR_NAMES = "pci,kms,yh";
    int TIMES = 5;

    @Before
    public void setUp() throws Exception {
        raceService = new RaceService();
        expect = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        raceService = null;
    }

    @Test
    public void 난수발생레이스결과() {
        raceService.run(CAR_NAMES, TIMES);
    }

    @Test
    public void 전진() {
        Car car = new Car("pci");
        car.foward(4);
        assertEquals(1, car.getPosition());
    }


}