package racing.view;

import java.util.Random;

public class Car {
    Random random = new Random();

    public int runOrStay() {
        if (this.getRandomVal() < 4) {
            return 0;
        }
        return 1;
    }

    private int getRandomVal() {
        return random.nextInt(10);
    }
}
