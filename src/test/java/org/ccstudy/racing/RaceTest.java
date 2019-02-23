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
    String CAR_NAMES = "pci,kms,yh";
    int TIMES = 5;

    @Before
    public void setUp() throws Exception {
        race = new Race(CAR_NAMES, TIMES);
        expect = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        race = null;
    }

    @Test
    public void 난수발생레이스결과() {
        race.run();

        race.result();
    }

    @Test
    public void 전진() {
        Car car = new Car("pci");
        car.foward(4);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void 우승자보기() {
        race.run();
        List<Car> winner = race.getWinCars();
        for (Car car : winner)
            System.out.println(car.getName());
    }

}