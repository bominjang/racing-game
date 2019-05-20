package util;

import java.util.Random;

public class ExtractRandom {
    private final static int RANDOM_BOUND =10;

    public static int getRandomNumber(){
        return new Random().nextInt(RANDOM_BOUND);
    }
}
