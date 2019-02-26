package com.ccstudy.racing;

import org.junit.Test;

import static org.junit.Assert.*;

public class RacingCarControllerTest {

    @Test
    public void 게임테스트() {
        RacingCarController raceController = new RacingCarController(new RacingCarService());
        raceController.fixedStartGame();
    }
}