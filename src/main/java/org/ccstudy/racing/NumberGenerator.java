package org.ccstudy.racing;

import java.util.Random;

public class NumberGenerator {

    private final static Integer BOUNDARY = 10;

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(BOUNDARY);
    }

}
